public class Main {
    public static void main(String[] args) {

        // Passaggi per creare un messaggio di errore personalizzato:
        // 1 creare una classe che estende la classe Exception --> la quale è figlia di throwable, impostare il costruttore con messaggio personalizzato
        // 2 creare una classe e all'interno del metodo creare un check che ti permetta di lanciare l'errore
        // 3 effettuare il test sul main

        // TEST MYEXCEPTION
        UtilityException utilityException = new UtilityException();

        try {
            utilityException.useMyException("cio");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        // TEST STUDENT
        Studente studente = new Studente();
        studente.setAge(20);

        try{
            studente.checkAge(studente);
        }catch (MyThirdException e){
            System.out.println(e.getMessage());
        }

        // TEST MYSECONDEXCEPTION
        try{
            utilityException.useMySecondException("ovaergererg");
        }catch(MySecondException e){
            System.out.println(e.getMessage());
        }
    }
}