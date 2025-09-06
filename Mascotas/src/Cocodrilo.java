public class Cocodrilo extends Mascotas{
    public String especie;
    public Cocodrilo(String nombre, int edad, String especie) {
        super(nombre, edad, "Cocodrilo");
        this.especie = especie;
    }
    public void sonidoCocodrilo() {
        System.out.println( getNombre() + " dice: ¡Siseo...Siseo...Siseo!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mascota: " + getNombre() +
                " | Tipo: " + getAnimal() +
                " | Raza: " + especie +
                " | Edad: " + getEdad() + " años");
    }
}