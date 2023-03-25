package Cliente;

import java.util.ArrayList;
import java.util.Objects;

public class GestoreAbbonamenti {
    private ArrayList<Abbonamento> abbonamenti= new ArrayList<>();

    public void addAbbonamneti(int durata, String nome, int prezzo){
        Abbonamento abb= new Abbonamento(durata,nome,prezzo,false);
        abbonamenti.add(abb);
    }
    public Boolean rimuoviAbbonamneti(int durata, String nome, int prezzo){
        for (Abbonamento a:abbonamenti){
            if (a.getDurata()==durata & a.getPrezzo()==prezzo & Objects.equals(a.getNome(), nome)){
                abbonamenti.remove(a);
                return true;
            }
        }
        return false;
    }
    public void vediAbbonamenti(){
        int i=1;
        for (Abbonamento a:abbonamenti){
            System.out.println("Abbonamento n:"+i);
            a.visualizzaAbbonamento();
            i++;
        }
    }
    public Abbonamento getAbbonamneto(int index, boolean corsi){
        Abbonamento abbonamento= new Abbonamento(abbonamenti.get(index));
        abbonamento.setCorsi(corsi);
        return abbonamento;
    }

    public ArrayList<Abbonamento> getAbbonamenti() {
        return abbonamenti;
    }
}
