package GestoreLogin;

import Cliente.Cliente;
import IstruttoreCalendario.Istruttore;

public class GestoreLogin {
    private ListaCredenzialiCliente listaCredenziali;
    private ListaCredenzialiIstruttore listaCredenzialiIstruttore;

    public GestoreLogin(ListaCredenzialiCliente listaCredenziali, ListaCredenzialiIstruttore l) {
        this.listaCredenziali = listaCredenziali;
        listaCredenzialiIstruttore=l;
    }

    public Cliente loginCliente(String username, String password){
        if(listaCredenziali.checkCredenziali(username, password)==true){
            Cliente cliente=listaCredenziali.getCliente(username, password);
            System.out.println("credenziali giuste"+" "+cliente);
            return cliente;
        }
        else System.out.println("credenziali non trovate");
        return null;
    }

    public void registraCliente(String username, String password, Cliente cliente){
        listaCredenziali.addCredenziali(username, password, cliente);
    }

    public void removeCredenzialiCliente(String username, String password){
        listaCredenziali.removeCredenziali(username,password);
    }

    public Istruttore loginIstruttore(String username, String password){
        if(listaCredenzialiIstruttore.checkCredenziali(username, password)==true){
            Istruttore istruttore=listaCredenzialiIstruttore.getIstruttore(username, password);
            System.out.println("credenziali giuste"+" "+istruttore);
            return istruttore;
        }
        else System.out.println("credenziali non trovate");
        return null;
    }

    public void registraIstruttore(String username, String password, Istruttore istruttore){
        listaCredenzialiIstruttore.addCredenziali(username,password,istruttore);
    }

    public void removeCredenzialiIstruttore(String username, String password){
        listaCredenzialiIstruttore.removeCredenziali(username,password);
    }
}

