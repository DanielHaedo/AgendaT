import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String tituloMenu = "===Menu de la Agenda de Contactos===";
        int opcionSeleccionada;

        Scanner sc = new Scanner(System.in);

        System.out.println(tituloMenu);
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Mostrar Contacto");
        System.out.println("3. Buscar Contacto");
        System.out.println("4. Salir");
        System.out.print("Por favor, introduce el número de la opción que desea buscar: ");

        opcionSeleccionada = sc.nextInt();

        System.out.println("\n----------------------------------------");
        System.out.println("Has seleccionado la opción número: ");
        System.out.println(opcionSeleccionada);
        System.out.println("-------------------------------------------");
        System.out.println("Gracias por usar la aplicación!");

        sc.close();

    }
}

