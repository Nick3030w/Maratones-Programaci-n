import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Dada la fecha de nacimiento de una persona da en Días, Mes y Año, así como la
 * fecha
 * actual determinar la edad de la persona.
 * 
 * @author Nick3030w
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento
        System.out.print("Ingrese el año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        int mesNacimiento = scanner.nextInt();
        System.out.print("Ingrese el dia de nacimiento: ");
        int diaNacimiento = scanner.nextInt();

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);

        // Calcular la edad
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edad = periodo.getYears();

        // Mostrar la edad
        System.out.println("La edad de la persona es: " + edad + " años.");
        scanner.close();
    }
}
