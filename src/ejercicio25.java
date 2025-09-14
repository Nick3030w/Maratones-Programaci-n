import java.util.Scanner;

/**
 * You are given a DNA sequence: a string consisting of characters A, C, G, and
 * T. Your task
 * is to find the longest repetition in the sequence. This is a maximum-length
 * substring
 * containing only one type of character.
 * 
 * @author Nick3030w
 */
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String dna = lector.nextLine();
        char[] caracteres = dna.toCharArray();
        int maxRepeticiones = 1;
        int repeticionesActuales = 1;
        /**
         * Recorro el arreglo de caracteres y comparo el caracter actual con el anterior
         * Si son iguales aumento el contador de repeticiones actuales
         */
        for (int i = 1; i < caracteres.length; i++) {
            if (caracteres[i] == caracteres[i - 1]) {
                repeticionesActuales++;
            } else {
                if (repeticionesActuales > maxRepeticiones) {
                    maxRepeticiones = repeticionesActuales;
                }
                repeticionesActuales = 1;
            }
        }
        /**
         * Al final del ciclo, comparo las repeticiones actuales con el maximo de
         * repeticiones
         * para asegurarme de que no se pierda el conteo en caso de que la secuencia
         * termine
         * con la mayor cantidad de repeticiones
         */
        if (repeticionesActuales > maxRepeticiones) {
            maxRepeticiones = repeticionesActuales;
        }
        System.out.println("La mayor cantidad de repeticiones es: " + maxRepeticiones);
    }
}
