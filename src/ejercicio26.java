
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
        static Scanner lector = new Scanner(System.in);
        int numOfValues = lector.nextInt();
        int[] values = new int[numOfValues];
        for (int i = 0; i < numOfValues; i++) {
            values[i] = lector.nextInt();
        }

    }
}
