import java.util.Scanner;

/**
 * Weird Algorithm
 * Consider an algorithm that takes as input a positive integer n. If n is even,
 * the algorithm
 * divides it by two, and if n is odd, the algorithm multiplies it by three and
 * adds one. The
 * algorithm repeats this, until n is one. For example, the sequence for n=3 is
 * as follows:
 * 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * Your task is to simulate the execution of the algorithm for a given value of
 * n.
 * 
 * @author Nick3030w
 */
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = 0;
        n = lector.nextInt();

        while (n != 1) {
            if (n % 2 == 0) {
                n = par(n);
            } else {
                n = impar(n);
            }
        }

    }

    public static int par(int n) {
        n = n / 2;
        System.out.println(n);
        return n;
    }

    public static int impar(int n) {
        n = (n * 3) + 1;
        System.out.println(n);
        return n;
    }
}
