package Allenamento;

import java.util.ArrayList;

public class Scheda {
    private ArrayList<ProgrammaAllenamento> programma=new ArrayList<>();
    private int nProg=0;
    private String istruttore;
    private String obbiettivo;

    public Scheda(String istruttore, String obbiettivo) {
        this.istruttore = istruttore;
        this.obbiettivo = obbiettivo;
    }

    public void addProgramma(ProgrammaAllenamento p){
        programma.add(p);
        nProg++;
    }
    public void removeProgramma(ProgrammaAllenamento p){
        programma.remove(p);
        nProg--;
    }
    public void visualizzaProgramma(int pos){
        programma.get(pos).visualizzaProgramma();
    }
    public void visualizzaScheda(){
        for (int i=0;i<nProg; i++)
            programma.get(i).visualizzaProgramma();
    }
}
