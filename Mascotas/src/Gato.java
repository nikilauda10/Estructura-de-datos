public class Gato extends Mascotas{
    public String raza;
    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad, "Gato");
        this.raza = raza;
    }
    public void maullar() {
        System.out.println( getNombre() + " dice: ¡miaaaaauuuuuuu!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mascota: " + getNombre() +
                " | Tipo: " + getAnimal() +
                " | Raza: " + raza +
                " | Edad: " + getEdad() + " años");
    }
}


