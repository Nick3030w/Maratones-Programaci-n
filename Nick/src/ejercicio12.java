import java.util.Scanner;

/**
 * 12. Dado un valor numérico entero (de cualquier cantidad de cifras) decir si
 * leído en orden
 * inverso es el mismo.
 * 
 * @author Nick3030w
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String numero = lector.nextLine();
        boolean esLoQueQuiero = true;

        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) != numero.charAt(numero.length() - 1 - i)) {
                esLoQueQuiero = false;
            }

        }
        if (esLoQueQuiero) {
            System.out.println("El numero se lee igual al revés");
        } else {
            System.out.println("El numero no se lee igual al revés");
        }
        lector.close();
    }
}
