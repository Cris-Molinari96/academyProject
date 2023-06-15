import java.util.ArrayList;

public class Cassa {
    // stiamo passando un interfaccia, o la classe madre
    // come parametro di un metodo perchè ho bisogno di accedere per ereditarietà ai get
    // in modo da poter calcolarmi il prezzo totale
     public double prezzoTotale(Articolo[] o){

         double sum = 0;
         for (int i = 0; i < o.length; i++) {
             sum += o[i].getPrezzo();
         }
         return sum;
    }
}
