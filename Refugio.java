import java.util.LinkedList;

public class Refugio {
    private LinkedList<Animal> animales = new LinkedList<Animal>();

    public void addAnimal(Animal nuevo_animal){
        /* Add es una funcion de LinkedList que por
         defecto te añade los elementos al final
         https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#add(E)
         */
        this.animales.add(nuevo_animal);
    }

    public int encontrarAnimal(EspecieAnimal especie){
        for(int i=0; i<this.animales.size(); i++){
            Animal aux = this.animales.get(i);
            if(aux.especie == especie){
                return i;
            }
        }
        return -1;
    }

    public Gato adoptaGato(){
        int index = this.encontrarAnimal(EspecieAnimal.GATO);
        if(index!=-1) {
            Gato g = (Gato) this.animales.get(index);
            this.animales.remove(index);
            return g;
        }
        System.out.println("No hay gatos en el refugio");
        return null;
    }

    public Perro adoptaPerro(){
        int index = this.encontrarAnimal(EspecieAnimal.PERRO);
        if(index != -1) {
            Perro p = (Perro) this.animales.get(index);
            this.animales.remove(index);
            return p;
        }
        System.out.println("No hay perros en el refugio");
        return null;
    }

    public Animal adoptaAnimal(){
        return this.animales.pop();
    }

    public void printAnimales(){
        System.out.print("Los animales del refugio:  ");
        System.out.println(this.animales);
    }
}
