public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Bau");
        Animal leone = new Leone("Aaarrgh");
        Animal tigre = new Tigre("mmmaargh");

        System.out.println(dog.getVerso());
        System.out.println(leone.getVerso());
        System.out.println(tigre.getVerso());


    }
}
