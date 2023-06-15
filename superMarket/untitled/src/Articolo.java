public abstract class Articolo implements OggettoPrezzabile {
    private double prezzo;

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
