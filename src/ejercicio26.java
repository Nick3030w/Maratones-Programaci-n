
/**
 * Palindrome Reorder
 * Given a String, your task is to reorder its letters in such a way that it
 * becomes a palindrome
 * (i.e., it reads the same from left to right and from right to left).
 * 
 * print a palindrome consisting of the characters of the original string. You
 * may print any valid
 * solution. if there are no solutions, prtint "NO SOLUTION".
 */
import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String s = lector.nextLine();

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        int contador = 0;
        char caracter = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                contador++;
                caracter = (char) ('A' + i);
            }
        }

        if (caracter > 1) {
            System.out.println("NO SOLUTION");
            return;
        }
    }
}
