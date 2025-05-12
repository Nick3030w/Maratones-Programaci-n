import java.util.Scanner;

/**
 * 10. Dado un valor numérico entero (de cualquier cantidad de cifras) decir en
 * cuántas
 * posiciones pares su correspondiente cifra también es par.
 * 
 * @author Nick3030w
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero: ");
            String numero = lector.nextLine();
            int contador = 0;
            for (int i = 0; i < numero.length(); i++) {
                if ((i + 1) % 2 == 0) { // Verificar si la pocision es par
                    int digito = Character.getNumericValue(numero.charAt(i));
                    if (digito % 2 == 0) {
                        contador++;
                    }
                }
            }
            System.out.println("El numero tiene " + contador + " posiciones pares con digitos pares");
        }
    }
}
