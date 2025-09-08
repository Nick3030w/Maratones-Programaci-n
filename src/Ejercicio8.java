import java.util.Scanner;

// 8. Dado un valor numérico entero de tres cifras obtener la suma de sus
// cifras.
/**
 * @author Nick3030w
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingrese un valor entero de 3 cifras");
            int valor = lector.nextInt();
            long suma = 0;
            // Verificar si el valor es de 3 cifras
            if (valor >= 100 && valor <= 999) {
                // obtener las cifras del numero
                String valorString = Integer.toString(valor);
                for (int i = 0; i < valorString.length(); i++) {
                    suma += Character.getNumericValue(valorString.charAt(i));
                }
                System.out.println(suma);

            }
        }
    }
}
