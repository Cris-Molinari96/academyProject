public class Leone extends Animal{

    public Leone(String verso) {
        super(verso);
    }

    @Override
    public String suonoAnimale(){
        return getVerso();
    }
}
