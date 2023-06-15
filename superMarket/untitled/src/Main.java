public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro();
        Tv tv = new Tv();
        Telefono telefono = new Telefono();

        tv.setPrezzo(500);
        libro.setPrezzo(1000);
        telefono.setPrezzo(2000);

        Cassa cassa = new Cassa();

        Articolo[] o = {libro, telefono, tv};

        System.out.println(cassa.prezzoTotale(o) + " €");

    }
}