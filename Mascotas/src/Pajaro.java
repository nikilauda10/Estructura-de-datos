public class Pajaro extends Mascotas{
    public String raza;
    public Pajaro(String nombre, int edad, String raza) {
        super(nombre, edad, "Pajaro");
        this.raza = raza;
    }
    public void sonidoPajaro() {
        System.out.println( getNombre() + " dice: ¡Silbidoo....Silbido....!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mascota: " + getNombre() +
                " | Tipo: " + getAnimal() +
                " | Raza: " + raza +
                " | Edad: " + getEdad() + " años");
    }
}
