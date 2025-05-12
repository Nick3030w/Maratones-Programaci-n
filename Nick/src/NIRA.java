import java.util.Scanner;

public class NIRA {
    public static void main(String[] args) throws InterruptedException {
        imprimirPalabra("Te quieres casar conmigo?");
        System.out.println("SI / NO");
        Scanner lector = new Scanner(System.in);
        String answer = lector.nextLine();
        do {
            String responde = "RESPONDE BIEN -_- ";
            for (int i = 0; i < responde.length(); i++) {
                System.out.print(responde.charAt(i));
                Thread.sleep(70);
            }
            System.out.println("Segura????");
            System.out.println("SI / SI");
            answer = lector.nextLine();

        } while (answer.charAt(0) + answer.charAt(1) != 'S' + 'I');

        imprimirPalabra("YO TAMBIEN");
        String sabia = "Sabia que responderias correctamente ";
        for (int i = 0; i < sabia.length(); i++) {
            System.out.print(sabia.charAt(i));
            Thread.sleep(40);
        }
        System.out.println("TE AMO");

    }

    public static void imprimirPalabra(String palabra) throws InterruptedException {
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.substring(0, i));
            Thread.sleep(200);
        }

        for (int i = palabra.length(); i > 1; i--) {
            System.out.println(palabra.substring(0, i));
            Thread.sleep(200);
        }
    }
}
