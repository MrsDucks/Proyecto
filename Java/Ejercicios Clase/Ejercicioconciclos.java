import java.util.Scanner;
public class Ejercicioconciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 0) {
                continuar = false;
                continue; // Salir del ciclo actual y preguntar si desea salir al final.
            }

            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("No se puede dividir por cero.");
                        continue; // Volver a pedir una operación.
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    continue; // Volver a pedir una operación.
            }
            System.out.println("El resultado es: " + resultado);
        }
        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        scanner.close();
    }
}