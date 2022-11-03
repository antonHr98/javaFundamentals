
import java.util.Scanner;

/**
 * Write a program, which sums the ASCII codes of n characters. Print the sum on the console.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task04CharSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            String letter = scanner.nextLine();
            int toASCII = letter.charAt(0);
            totalSum += toASCII;
        }
        System.out.println(totalSum);
        scanner.close();
    }
}
