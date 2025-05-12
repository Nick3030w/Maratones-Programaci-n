import java.util.Scanner;

/**
 * 17. Dado dos matrices bidimensionales A y B de tamaño 5x5, calcule:
 * a) El producto de un escalar K por la matriz A.
 * b) La suma de las matrices A y B.
 * c) La diferencia de las matrices A y B.
 * d) El producto de las matrices A y B.
 * Nota: Guarde los diferentes resultados en un arreglo.
 * Consolas, 'Courier New', monospace
 * 
 * @author Nick3030w
 */
public class ejercicio17 {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        String A = "matriz A";
        String B = "matriz B";

        // Valores de A y B e imprimirlos
        // valores de A: 2 3 2 3 4 3 2 3 2 1 2 3 4 3 2 3 2 3 2 3 2 3 2 2 2
        // valores de B: 1 2 3 4 5 6 7 8 9 10 1 2 3 6 5 7 8 9 5 1 2 3 5 4 6
        ingresarValoresMatriz(matrizA, A);
        imprimirMatriz(matrizA, A);
        ingresarValoresMatriz(matrizB, B);
        imprimirMatriz(matrizB, B);
        multiplicarEscalar(matrizA);
        sumaMatrices(matrizA, matrizB);
        diferenciaMatrices(matrizA, matrizB);
        productoMatrices(matrizA, matrizB);

    }

    private static void productoMatrices(int[][] matrizA, int[][] matrizB) {
        // numero de columnas matriz A
        int CA = matrizA.length;
        // numero de filas matriz B
        int FB = matrizB[0].length;
        int[][] producto = new int[CA][FB];
        if (CA == FB) {
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    for (int j2 = 0; j2 < producto.length; j2++) {
                        producto[i][j] = matrizA[][ + matrizB;
                    };

                }
            }
        }

    }

    /**
     * c) La diferencia de las matrices A y B.
     * 
     * @param matrizA
     * @param matrizB
     */
    private static void diferenciaMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] diferencia = new int[5][5];
        for (int i = 0; i < diferencia.length; i++) {
            for (int j = 0; j < diferencia[i].length; j++) {
                diferencia[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        imprimirMatriz(diferencia, "Diferencia entre A y B");
    }

    /**
     * b) La suma de las matrices A y B.
     * 
     * @param matrizA
     * @param matrizB
     */
    private static void sumaMatrices(int[][] matrizA, int[][] matrizB) {
        int[][] suma = new int[5][5];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        imprimirMatriz(suma, "Suma de A y B");
    }

    // * a) El producto de un escalar K por la matriz A.
    private static void multiplicarEscalar(int[][] matrizA) {
        System.out.println("Ingrese un escalar K para multiplicar por la matriz A");
        int escalarK = lector.nextInt();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = matrizA[i][j] * escalarK;
            }
        }
        imprimirMatriz(matrizA, "A * k");
    }

    /**
     * Metodo para ingresar los valores de una matriz 5*5
     * 
     * @param matriz
     * @param indice
     */
    public static void ingresarValoresMatriz(int[][] matriz, String indice) {
        System.out.println("Ingrese los 25 valores de la matriz " + indice + ": ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("posicion [" + (i + 1) + "], [" + (j + 1) + "] ");
                matriz[i][j] = lector.nextInt();
            }
        }
    }

    /**
     * Metodo para imprimir una matriz 5*5
     * 
     * @param matriz
     * @param indice
     */
    public static void imprimirMatriz(int[][] matriz, String indice) {
        System.out.println(indice + ": ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
