import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Negozio negozio = new Negozio();
        Negozio sc = new Sconto();

        Scanner scannerD = new Scanner(System.in);
        negozio.setPrezzo(scannerD.nextDouble());


        sc.setPrezzo(negozio.getPrezzo());

        System.out.println("Prezzo non scontato" + negozio.getPrezzo());
        System.out.println("Nuovo prezzo" + sc.getPrezzo());
    }
}