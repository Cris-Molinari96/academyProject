public class ContoCorrente {
    private String bankName;
    private String name;
    private String surname;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSaldo() {
        return balance;
    }

    public void setSaldo(double balance) {
        this.balance = balance;
    }

    public boolean prelievo(double richiestaPrelievo){
        if(richiestaPrelievo > balance){
           return false;
        }else{
            balance -= richiestaPrelievo;
            return true;
        }
    }

    public boolean aggiungiSoldi(double cash){
        balance += cash;
        return true;
    }
}
