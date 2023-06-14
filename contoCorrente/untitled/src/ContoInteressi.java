public class ContoInteressi extends ContoCorrente{
    private double interesse = 5;
    private ContoCorrente contoCorrente;

    public double getInteresse() {
        return interesse;
    }

    public void setInteresse(double interesse) {
        this.interesse = interesse;
    }

    // stiamo aggiornando il saldo della classe madre
    // per accedere ad un metodo della superClasse utilizziamo la keyWord super
    @Override
    public double getSaldo() {
        double newBalance = super.getSaldo() * interesse;
            return newBalance;
    }

}
