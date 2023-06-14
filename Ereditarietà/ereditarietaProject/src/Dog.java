public class Dog extends Animal{

    public Dog(String verso) {
        super(verso);
    }

    @Override
    public String suonoAnimale(){
        return getVerso();
    }
}
