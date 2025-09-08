import java.util.Scanner;

/**
 * 11. Dado un valor numérico entero (de cualquier cantidad de cifras)
 * determinar si la suma
 * de las cifras de posiciones pares es igual a la suma de las posiciones
 * impares.
 * 
 * @author Nick3030w
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String numero = lector.nextLine();
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < numero.length(); i++) {
            int digito = Character.getNumericValue(numero.charAt(i));
            if ((i + 1) % 2 == 0) { // posiscion par
                contadorPares += digito;
            } else {
                contadorImpares += digito;
            }
        }
        System.out.println("Suma de numeros pares: " + contadorPares);
        System.out.println("Suma de numeros impares: " + contadorImpares);
        if (contadorPares == contadorImpares) {
            System.out.println("lasn sumas de los numeros pares e impares son iguales");
        } else {
            System.out.println("La suma de los numeros impares y pares es diferente");
        }
        lector.close();

    }
}
