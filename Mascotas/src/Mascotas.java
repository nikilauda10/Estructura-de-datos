public class Mascotas {
    private String nombre;
    private String animal;
    private int edad;


    public Mascotas(String nombre, int edad, String animal) {
        this.nombre = nombre;
        this.edad = edad;
        this.animal = animal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAnimal() {
        return this.animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void dormir(){
        System.out.println(".....ZZZZZZ.......ZZZZZZZZ");
    }
    public void comer(){
        System.out.println("El animal esta comiendo no lo puede ver");
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre + "Tengo" + this.edad +"años" + "Soy un:" + this.animal);
    }
}
