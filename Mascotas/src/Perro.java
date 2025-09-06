public class Perro extends Mascotas{
    public String raza;
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, "perro");
        this.raza = raza;
    }
    public void ladrar() {
        System.out.println( getNombre() + " dice: ¡Guau guau!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mascota: " + getNombre() +
                " | Tipo: " + getAnimal() +
                " | Raza: " + raza +
                " | Edad: " + getEdad() + " años");
    }
}

