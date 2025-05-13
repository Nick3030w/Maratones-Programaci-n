import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Dado un listado de números verifique si la suma de los números impares es un
 * número
 * primo, en caso contrario determine entre qué números primos se encuentra.
 *
 * @author Nick3030w
 * 
 */
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int cantidad = lector.nextInt();
        System.out.println("Ingrese los numeros uno por uno: ");
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = lector.nextInt();
        }
        System.out.println("La suma de numeros impares es: " + sumaNumerosImpares(numeros)); // muestra la suma de los
                                                                                             // impares
        // Verificar si la suma es un numero primo

        if (esPrimo(sumaNumerosImpares(numeros))) {
            System.out.println("la suma " + sumaNumerosImpares(numeros) + " Es un numero primo. ");
        } else {
            System.out.println("La suma " + sumaNumerosImpares(numeros) + " No es un numero primo");

        }
        List<Integer> primosCercanos = encontrarPrimosCercanos(sumaNumerosImpares(numeros));

        System.out.println(sumaNumerosImpares(numeros) + " Se encuentra entre los primos " + primosCercanos.get(0)
                + " y " + primosCercanos.get(1));

        lector.close();
    }

    /**
     * Metodo que verifica la suma de numeros impares dentro de una lista de numeros
     * 
     * @param numeros
     */
    private static int sumaNumerosImpares(int[] numeros) {
        int sumaImpares = 0;
        for (int num : numeros) {
            if (num % 2 != 0) { // verifica si el numero es impar
                sumaImpares += num;
            }
        }

        return sumaImpares;

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
        // Encontrar el primo inmediatamente menor
        // Si el numero-1 es mayor o igual a 2 y no es primo entonces paso al anterior
        while (primoMenor >= 2 && !esPrimo(primoMenor)) {
            primoMenor--;
        }

        // Encontrar el primo inmediatamente mayor
        int primoMayor = numero + 1;
        // si el numero no es primo entonces paso al siguiente
        while (!esPrimo(primoMayor)) {
            primoMayor++;
        }

        if (primoMenor > 2) {
            primosCercanos.add(primoMenor);
        }
        primosCercanos.add(primoMayor);

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
