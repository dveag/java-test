public class Main {
    public static void main(String[] args) {
        Refugio patitas = new Refugio();

        patitas.printAnimales();

        Gato gatomartino = new Gato("martino");

        patitas.addAnimal(gatomartino);

        Perro perromanuel = new Perro("manuel");

        patitas.addAnimal(perromanuel);
        patitas.printAnimales();

        Perro manuel2 = patitas.adoptaPerro();

        System.out.println(manuel2);
        patitas.printAnimales();
    }
}
