import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    //contrsuctores
        Perro perro1 = new Perro("Hulk", 3,"Pitbull");
        Perro perro2 = new Perro("Amarilla", 2,"Golden Retriever");
        Gato gato1 = new Gato("Choncho", 17,"Siames");
        Gato gato2 = new Gato("Totis", 4,"Sin raza");
        Serpiente serpiente1 = new Serpiente("Andrea", 19,"Elapidae");
        Cocodrilo cocodrilo1 = new Cocodrilo("Roberto", 15,"Crocodylus moreletii");
        Pajaro pajaro1 = new Pajaro("Piolin", 2,"Canario");

        do{
        System.out.println("Tienda Mascotas");
        System.out.println("1- Perro");
        System.out.println("2- Gato");
        System.out.println("3- Serpiente");
        System.out.println("4- Cocodrilo");
        System.out.println("5- Pajaro ");
        System.out.println("6- Perro");
        System.out.println("7- Gato");
        System.out.println("0- Salir");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                perro1.mostrarInfo();
                perro1.ladrar();
                break;
            case 2:
                gato1.mostrarInfo();
                gato1.maullar();
                break;
            case 3:
                serpiente1.mostrarInfo();
                serpiente1.dormir();
                break;
            case 4:
                cocodrilo1.mostrarInfo();
                cocodrilo1.sonidoCocodrilo();
                break;
            case 5:
                pajaro1.mostrarInfo();
                pajaro1.sonidoPajaro();
                break;
            case 6:
                perro2.mostrarInfo();
                perro2.comer();
                break;
            case 7:
                gato2.mostrarInfo();
                gato2.maullar();
                gato2.comer();
                break;
            case 0:
                System.out.println("SALIENDO......");
                break;
                default:
                    System.out.println("Esa es exotica bro,no la puedes ver");
        }

    }while (opcion != 0);
    }
}