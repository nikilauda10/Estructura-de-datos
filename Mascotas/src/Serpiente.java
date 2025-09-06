public class Serpiente extends Mascotas{
    public String especie;
    public Serpiente(String nombre, int edad, String especie) {
        super(nombre, edad, "Serpiente");
        this.especie = especie;
    }
    public void sonidoSerpiente() {
        System.out.println( getNombre() + " dice: ¡---------tsss-------!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mascota: " + getNombre() +
                " | Tipo: " + getAnimal() +
                " | Raza: " + especie +
                " | Edad: " + getEdad() + " años");
    }
}
