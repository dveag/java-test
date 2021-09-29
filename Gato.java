public class Gato extends Animal{

    public Gato(String nombre) {

        super(nombre);
        this.especie = EspecieAnimal.GATO;
    }

    @Override
    public String toString() {
        return "Gato:" + nombre;
    }
}
