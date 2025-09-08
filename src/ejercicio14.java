import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Dado un número natural determinar si es narcisista o no. Un número es
 * narcisista si es
 * igual a la suma de las potencias de sus cifras elevadas a la cantidad de
 * cifras del número.
 * Por ejemplo, el número 153 pues, tiene 3 cifras y 13 + 53 + 33 = 153.
 * 
 * @author Nick3030w
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        long numero = -1;
        while (numero < 0) {
            System.out.println("Ingrese un numero natural");
            numero = lector.nextLong();
        }
        String numString = Long.toString(numero);
        int cantidadCifras = numString.length();
        List<Integer> numeros = new ArrayList<>();
        long suma = 0;
        for (int i = 0; i < cantidadCifras; i++) {
            numeros.add(Character.getNumericValue(numString.charAt(i)));
        }
        for (int i = 0; i < cantidadCifras; i++) {
            suma += Math.pow(numeros.get(i), cantidadCifras);
        }
        System.out.println("numero: " + numero);
        System.out.println("Cantidad de cifras " + cantidadCifras);
        System.out.println("Suma de las potencias elevadas a la cantidad de cifras del numero: " + suma);
        if (suma == numero) {
            System.out.println("El numero " + numero + " es un numero narcisista");
        } else {
            System.out.println("El numero " + numero + " NO es un numero narcisista");
        }
        lector.close();
    }
}
