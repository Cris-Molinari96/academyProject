import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContoCorrente contoCorrente = new ContoCorrente();
        contoCorrente.setSaldo(5000);

        ContoCorrente contoInteressi = new ContoInteressi();
        contoInteressi.setSaldo(contoCorrente.getSaldo());

        double richiesta = 500;

        System.out.println(contoInteressi.getSaldo() + "€");
        System.out.println(contoCorrente.getSaldo() + "€");

       /* if(contoCorrente.prelievo(richiesta)){
            System.out.println("Prelievo effettuato, \n New balance " + contoInteressi.getSaldo() + "€");
        } else{
            System.out.println("Non puoi prelevare di più di quanto hai nel saldo \n"
                    + "Richiesta:"+ richiesta + "€"
                    + "Saldo:" + contoCorrente.getSaldo() + "€");
        }*/

    }
}
