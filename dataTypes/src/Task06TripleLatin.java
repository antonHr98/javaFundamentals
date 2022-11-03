
import java.util.Scanner;

/**
 * Write a program to read an integer n and print all triples of the first n small Latin letters,
 * ordered alphabetically:
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task06TripleLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        n += 97;
        for (int i = 97; i < n; i++) {
            for (int j = 97; j < n; j++) {
                for (int k = 97; k < n; k++) {
                    char letter1 = (char) i;
                    char letter2 = (char) j;
                    char letter3 = (char) k;
                    System.out.printf("%c%c%c\n", letter1, letter2, letter3);
                }
            }
        }
        scanner.close();
    }
}
