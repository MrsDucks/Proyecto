import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

System.out.println("Selecciona una opción (1 para Saludar, 2 para Despedirse, 3 para Salir): ");

int opcion = scanner.nextInt();

switch (opcion) {
    case 1:
        System.out.println("Hola, ¡bienvenido!");
        break;
    case 2:
        System.out.println("Adiós, ¡hasta luego!");
        break;
    case 3:
        System.out.println("Saliendo del programa...");
        break;
    default:
        System.out.println("Opción no válida");
}
scanner.close();
}
}
