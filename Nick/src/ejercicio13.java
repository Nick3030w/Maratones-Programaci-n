import java.util.ArrayList;
import java.util.List;

/**
 * Dado un listado de números verifique si la suma de los números impares es un
 * número
 * primo, en caso contrario determine entre qué números primos se encuentra.
 *
 * @author Nick3030w
 */

public class ejercicio13 {

    public static void main(String[] args) {
        int[] numeros = { 2, 4, 3, 5, 4, 3, 2, 3, 4, 12 };
    }

    /**
     * Metodo que verifica la suma de numeros impares dentro de una lista de numeros
     * 
     * @param numeros
     */
    private static void verificarSumaImpares(int[] numeros) {
        int sumaImpares = 0;
        for (int num : numeros) {
            if (num % 2 != 0) { // verifica si el numero es impar
                sumaImpares += num;
            }
        }
        System.out.println("La suma de numeros impares es: " + sumaImpares); // muestra la suma de los impares
        // Verificar si la suma es un numero primo

        if (esPrimo(sumaImpares)) {
            System.out.println("la suma " + sumaImpares + " Es un numero primo. ");
        } else {
            System.out.println("La suma " + sumaImpares + " No es un numero primo");

        }
        // Encontrar los numeros primos entre los que se encuentra la suma de los
        // numeros

        List<Integer> primosCercanos = encontrarPrimosCercanos(sumaImpares);

        System.out.println("Se encuentra entre los primos " + primosCercanos.get(0) + " y " + primosCercanos.get(1));

    }

    /**
     * Metodo para encontrar los primos mas cercanos de un numero
     * 
     * @param sumaImpares
     * @return
     */
    private static List<Integer> encontrarPrimosCercanos(int numero) {
        List<Integer> primosCercanos = new ArrayList<>();

        if (numero < 2) {// Si el numero es menos que dos, el unico numero primo cercano es el 2
            primosCercanos.add(2);
            return primosCercanos;
        }
        int primoMenor = numero - 1;

        return primosCercanos;
    }

    /**
     * Metodo para verificar si un numero es primo
     * 
     * @param numero
     * @return
     */
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {// 2 es el unico numero par primo
            return true;
        }
        // Solo verifica divisores impares, solo verifica hasta la raiz del numero para
        // reducir complejidad y si existe cualquier divisor no es un numero primo
        for (int i = 3; i < Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {// Verifica si es divisible por el numero
                return false;
            }
        }
        return true;// Si pasa por todo el metodo significa que si es primo
    }
}
