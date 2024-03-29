import Abbonamento.GestoreAbbonamenti;
import Controller.ControllerCorso;
import GestioneRichieste.*;
import Controller.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        ControllerCorso calendario = new ControllerCorso(2023);
        GestorePT gestorePT = new GestorePT(10,calendario);
        GestoreAbbonamenti gestoreAbbonamenti = new GestoreAbbonamenti();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = currentDate.format(formatter);
        gestoreAbbonamenti.addAbbonamenti(1,"mensile",60, dateString);
        gestoreAbbonamenti.addAbbonamenti(3,"trimestrale",180,dateString);
        gestoreAbbonamenti.addAbbonamenti(6,"semestrale",360,dateString);
        gestoreAbbonamenti.addAbbonamenti(12,"annuale",720,dateString);
        GestoreRichiestaScheda gestoreRichiestaScheda = new GestoreRichiestaScheda();

        Scanner sc = new Scanner(System.in);
        ControllerLogin controllerLogin= new ControllerLogin(gestoreRichiestaScheda);
        controllerLogin.registraCliente(sc);
        ControllerCliente cliente=new ControllerCliente(controllerLogin.loginCliente(sc),gestoreAbbonamenti,gestorePT,calendario);
        controllerLogin.registraIstruttore(sc);
        ControllerIstruttore istruttore=new ControllerIstruttore(controllerLogin.loginIstruttore(sc),calendario,gestoreRichiestaScheda,gestorePT);

        cliente.ottieniAbbonamento(sc);
        cliente.richiediScheda(sc);
        istruttore.ottieniRichiestaScheda(sc);
        istruttore.inserisciCorso(sc);
        cliente.vediCalendario();
        cliente.prenotaCorso(sc);
        cliente.vediAbbonamento();
        cliente.visualizzaScheda(sc);
        sc.close();

    }
}