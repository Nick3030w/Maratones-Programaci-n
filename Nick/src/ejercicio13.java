import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Dado un listado de números verifique si la suma de los números impares es un
 * número
 * primo, en caso contrario determine entre qué números primos se encuentra.
 *
 * @author Nick3030w
 */

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un listado de numeros separados por espacios");
        String listadoDeNumeros = lector.nextLine();
        String[] lista = listadoDeNumeros.split(" ");
        List<Integer> numeros = new ArrayList<>();
        int sumaImpares = 0;

        // Convertir los numeros de String a Integer
        for (String numString : lista) {
            try {
                numeros.add(Integer.parseInt(numString));
            } catch (Exception e) {
                System.out.println("Entrada invalida, solo se aceptan numeros enteros");
                return;
            }
        }

        // Filtrar impares y calcular su suma
        for (Integer num : numeros) {
            if (num % 2 != 0) {// verificar si es par
                sumaImpares += num;
            }
        }
        System.out.println("Suma de impares: " + sumaImpares);

        if (esPrimo(sumaImpares)) {
            System.out.println("La suma de impares( " + sumaImpares + " ) es un numero primo. ");

        } else {
            System.out.println("La suma de impares( " + sumaImpares + " ) NO es un numero primo. ");
        }

        // Encontrar los numeros primos mas cercanos
        int primoAnterior = encontrarPrimoAnterior(sumaImpares);
        int primoPosterior = encontrarPrimoPosterior(sumaImpares);

        System.out.println("el numero primo anterior mas cercano es: " + primoAnterior
                + " y el numero primo posterior mas cercano es: " + primoPosterior);

        lector.close();
    }

    /**
     * Metodo para verificar si un numero es primo
     * 
     * @param num
     * @return
     */

    public static boolean esPrimo(int num) {
        return true;
    }

    /**
     * Metodo para encontrar el primo anterior mas cercano
     * 
     * @param num
     * @return
     */
    public static int encontrarPrimoAnterior(int num) {
        return 0;
    }

    /**
     * Metodo para encontrar el numero primo posterior mas cercano
     * 
     * @param num
     * @return
     */
    public static int encontrarPrimoPosterior(int num) {
        return num;

    }
}
