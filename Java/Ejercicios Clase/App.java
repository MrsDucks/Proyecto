//David Alejandro Vázquez Boss
//Ángel González Tacías

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos desde el teclado

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para la entrada de datos

        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine(); // Solicita el nombre del alumno

        double sumaCalificaciones = 0; // Inicializa la suma de calificaciones a cero

        // Solicita las calificaciones de 6 materias y calcula la suma de calificaciones
        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese la calificación de la materia " + i + ": ");
            double calificacion = scanner.nextDouble();
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / 6; // Calcula el promedio de calificaciones

        // Muestra el promedio
        System.out.println("El promedio de calificaciones de " + nombreAlumno + " es: " + promedio);

        // Evalúa el promedio y muestra un mensaje personalizado
        if (promedio == 10) {
            System.out.println("¡Felicidades, " + nombreAlumno + "! Tienes un promedio perfecto.");
        } else if (promedio >= 8 && promedio < 10) {
            System.out.println("Muy bien, buen trabajo, " + nombreAlumno + ".");
        } else if (promedio >= 6 && promedio < 8) {
            System.out.println("Necesitas esforzarte un poco más, " + nombreAlumno + ", ¡las cosas van bien!");
        } else {
            System.out.println("Lo siento, " + nombreAlumno + ", estás reprobado y debes estudiar más.");
        }

        scanner.close(); // Cierra el objeto Scanner
    }
}

/*
1. Importamos la clase Scanner para permitir la entrada de datos desde el teclado.

2. Creamos una clase llamada CalculoPromedio.

3. En el método main, creamos un objeto Scanner llamado scanner para obtener entradas del usuario.

4. Solicitamos al usuario que ingrese el nombre del alumno y almacenamos la entrada en la variable nombreAlumno.

5. Inicializamos una variable sumaCalificaciones para almacenar la suma de las calificaciones de las materias y la inicializamos en cero.

6. Usamos un bucle for para solicitar las calificaciones de 6 materias. En cada iteración del bucle, pedimos una calificación al usuario y la sumamos a sumaCalificaciones.

7. Calculamos el promedio dividiendo la suma de las calificaciones entre 6 y almacenamos el resultado en la variable promedio.

8. Mostramos el promedio junto con el nombre del alumno en la consola.

9. Evaluamos el promedio usando estructuras condicionales if-else. Dependiendo del valor del promedio, mostramos un mensaje personalizado.

10. Cerramos el objeto Scanner para liberar recursos.

Este programa permite calcular el promedio de calificaciones de un alumno, muestra un mensaje personalizado basado en el promedio y utiliza la entrada del usuario para recopilar información.
*/