import java.util.Scanner;

/**
 * Dado dos vectores A y B de tamaño 5, calcule:
 * a) El producto de un escalar K por el vector B.
 * b) La suma de los vectores A y B.
 * 
 * @author Nick3030w
 */
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] vectorA = new int[5];
        int[] vectorB = new int[5];

        System.out.println("Ingrese los numeros del vector A");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("A[" + i + "]: ");
            vectorA[i] = lector.nextInt();
        }

        System.out.println("Ingrese los numeros del vector B");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("B[" + i + "]: ");
            vectorB[i] = lector.nextInt();
        }

        System.out.println("Ingrese un escalar para calcular su producto con el vector B");
        int K = lector.nextInt();
        int[] productoKB = new int[5];
        for (int i = 0; i < productoKB.length; i++) {
            productoKB[i] = K * vectorB[i];
        }
        System.out.println("el producto del escalar " + K + " por el vector B es: ");
        for (int i = 0; i < productoKB.length; i++) {
            System.out.println(productoKB[i]);
        }
        // Suma de los vectores A y B
        int[] suma = new int[5];
        for (int i = 0; i < productoKB.length; i++) {
            suma[i] = vectorA[i] + vectorB[i];
        }
        System.out.println("La suma de los vectores A y B: ");
        for (int i = 0; i < suma.length; i++) {
            System.out.println(suma[i]);
        }
        lector.close();
    }
}
