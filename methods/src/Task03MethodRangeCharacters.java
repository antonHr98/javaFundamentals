
import java.util.Scanner;

/**
 *
 * Write a method that receives two characters and prints on a single line all the characters in between them
 * according to ASCII.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task03MethodRangeCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintCharsInGivenRange(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));
        scanner.close();
    }

    public static void PrintCharsInGivenRange(char symbol1, char symbol2) {
        if ((int) symbol1 < (int) symbol2) {
            for (int i = (int) symbol1 + 1; i < (int) symbol2; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = (int) symbol2 + 1; i < (int) symbol1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}