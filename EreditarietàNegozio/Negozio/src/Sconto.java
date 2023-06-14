public class Sconto extends Negozio{
    private double sconto = 5;
    @Override
     public double getPrezzo(){
        return super.getPrezzo() * sconto / 100;
    }
}
