package IstruttoreCalendario;

import Cliente.Generalita;

import java.util.ArrayList;
import java.util.List;

public class GiornoCalendario {
    private List<Corso> corsi = new ArrayList<>();
    private int giorno;
    public GiornoCalendario(int giorno) {
        this.giorno = giorno;
    }

    void inserisciCorso(Corso corso){
        corsi.add(corso);
    }
    boolean rimuoviCorso(Corso corso){
        return corsi.remove(corso);
    }

    boolean rimuoviPrenotazione(Corso corso){
        int index = corsi.indexOf(corso);
        if (index == -1){
            return false;
        }
        return corsi.get(index).rimuoviPrenotazione();
    }
    void vediCorso(Corso corso){
        int index = corsi.indexOf(corso);
        if(index == -1){
            System.out.println("Corso non presente\n");
        }else {
            String istruttore = corso.getIstruttore();
            System.out.println("Corso: " + corso.getNome());
            System.out.println("Istruttore: " + istruttore + "\n");
            System.out.println("Inizio: " + corso.getOrarioInizio() + "\n");
            System.out.println("Fine: " + corso.getOrarioFine() + "\n");
        }
    }

    void vediTuttiCorsi(){
        for(Corso corso : corsi){
            String istruttore = corso.getIstruttore();
            System.out.println("Corso: " + corso.getNome());
            System.out.println("Istruttore: " + istruttore + "\n");
            System.out.println("Inizio: " + corso.getOrarioInizio() + "\n");
            System.out.println("Fine: " + corso.getOrarioFine() + "\n");
        }
    }

    boolean prenotaCorso(Corso corso){
        int index = corsi.indexOf(corso);
        return corsi.get(index).prenota();
    }
    void rimuoviTuttiCorsi(){
        corsi.clear();
    }

}