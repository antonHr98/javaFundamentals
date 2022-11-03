
import java.util.Scanner;

/**
 * Write a program to display numbers from given start to given end and their sum. All the numbers will be
 * integers. On the first line, you will receive the start number, on the second the end number.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task04PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStart = Integer.parseInt(scanner.nextLine());
        int numberFinish = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = numberStart; i <= numberFinish; i++) {
            sum += i;
        }
        System.out.printf("Sum: %d", sum);
        scanner.close();
    }
}
