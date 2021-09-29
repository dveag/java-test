public class Animal {
    protected String nombre;
    protected EspecieAnimal especie;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieAnimal especie) {
        this.especie = especie;
    }
}
