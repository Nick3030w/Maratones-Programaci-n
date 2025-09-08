import java.util.Scanner;

/**
 * Dado 4 números (A, B, C y D) leídos por teclado determine cuál es el mayor
 * valor.
 * 
 * @author Nick3030w
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int mayorNumero = 0;

        System.out.println("Ingrese el primer numero: ");
        int A = lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        int B = lector.nextInt();
        System.out.println("Ingrese el numero 3");
        int C = lector.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int D = lector.nextInt();

        // Determinar cual es el mayor de los 4 numeros
        if (A > B && A > C && A > D) {
            mayorNumero = A;
        } else if (B > A && B > C && B > D) {
            mayorNumero = B;
        } else if (C > A && C > B && C > D) {
            mayorNumero = C;
        } else {
            mayorNumero = D;
        }
        // Mostrar el valor
        System.out.println("El mayor numero es: " + mayorNumero);
        lector.close();
    }
}
