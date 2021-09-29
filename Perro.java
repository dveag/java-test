public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
        this.especie = EspecieAnimal.PERRO;
    }

    @Override
    public String toString() {
        return "Perro:" + nombre;
    }
}