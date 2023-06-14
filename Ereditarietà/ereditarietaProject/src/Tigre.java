public class Tigre extends Animal{

    public Tigre(String verso) {
        super(verso);
    }

    @Override
    public String suonoAnimale(){
        return getVerso();
    }
}
