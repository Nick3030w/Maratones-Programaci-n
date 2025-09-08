import java.util.Scanner;

/**
 * Dado un valor numérico entero (de cualquier cantidad de cifras) obtener la
 * suma de sus
 * cifras.
 * 
 * @author Nick3030w
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String numero = lector.nextLine();
        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if (Character.isDigit(caracter)) {
                suma += Character.getNumericValue(caracter);
            }
        }
        System.out.println("La suma de las cifras es: " + suma);
        lector.close();
    }
}
