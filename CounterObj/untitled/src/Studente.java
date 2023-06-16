public class Studente {

//    Quando viene dichiarata una variabile o un metodo statico, questo si va a prendere
//    un'altra area della memoria la quale area possiamo dire dedicata alle variabili o
//    metodi statici

//    Le variabili statiche non sono proprietà di un classe infatti quando
//    faccio un nuovo new obj viene incrementata la varaibile statica


//    I metodi che accedono alle variabili statiche hanno per convenzione la dichiarazione static

    private static int counter = 0;
    private int id;

    public Studente() {
        this.id = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Studente.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
