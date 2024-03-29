package Istruttore;

import Controller.ControllerCorso;
import Cliente.Generalita;
import Controller.GestorePT;
import GestioneRichieste.GestoreRichiestaScheda;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class IstruttoreTest {
    static GestoreRichiestaScheda gt;
    static GestorePT gestorePT;
    static Generalita is;

    static Istruttore istruttore;
    static ControllerCorso ca;
    @BeforeClass
    public static void setUp() {
         gt = new GestoreRichiestaScheda();
         is = new Generalita("lcurss95d12d612u", "luca", "rossi");
         gestorePT = new GestorePT(10,ca);
         istruttore = new Istruttore(is);

    }
    @Test
    public void diventaPT() {
        istruttore.diventaPT();
        assertNotNull(istruttore.getGestoreRichiestaSchedaPT());
    }
}