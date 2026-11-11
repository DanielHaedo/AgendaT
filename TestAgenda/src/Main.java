import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tituloMenu = "===Menu de la Agenda de Contactos===";
        System.out.println(tituloMenu);
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Mostrar Contacto");
        System.out.println("3. Buscar Contacto");
        System.out.println("4. Salir");
        System.out.println("Por favor, introduce el número de la opción que desea buscar: ");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Añadir Contacto");
                break;
                case 2:
                    System.out.println("Mostrar Contacto");
                    break;
                    case 3:
                        System.out.println("Buscar Contacto");
                        break;
                        case 4:
                            System.out.println("Salir");
                            break;
            default:
                    System.out.println("Opcion no valida");
        }


        System.out.println("\n----------------------------------------");
        System.out.println("Has seleccionado la opción número: ");
        System.out.println(opcion);
        System.out.println("-------------------------------------------");
        System.out.println("Gracias por usar la aplicación!");

        sc.close();

    }
}

