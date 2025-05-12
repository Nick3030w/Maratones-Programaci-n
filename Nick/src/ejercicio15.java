import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 15. Dados un arreglo de n valores, determine la cantidad de veces que se
 * repite cada uno.
 * 
 * @author Nick3030w
 */
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese un listado de numeros separados por espacios");
        String listadoNumeros = lector.nextLine();
        String[] lista = listadoNumeros.split(" ");
        int contador = 0;
        // cambiar cada elemento de String a entero e ingresarlo en el ArrayList
        for (String numString : lista) {
            numeros.add(Integer.parseInt(numString));
        }
        // Ordenar la lista utilizando Collections.sort
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
        for (int i = 0; i < numeros.size(); i++) {
            if (i + 1 < numeros.size()) {
                if (numeros.get(i) == numeros.get(i + 1)) {
                    contador++;
                }
            }

        }
        System.out.println("La cantidad de veces que se repite cada numero en la lista es: " + contador + " veces");
        lector.close();
    }
}
