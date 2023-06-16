public class UtilityException{

    public void useMyException(String x)throws MyException{
        int num = x.length();
        if(num < 4){
            // è qui che viene creata la mia eccezione
            throw new MyException("String non valida");
        }
    }

    public void useMySecondException(String x)throws MySecondException{
        int y = x.length();
        if(y > 4){
            throw new MySecondException("Hai inserito una stringa troppo lunga");
        }
    }



}
