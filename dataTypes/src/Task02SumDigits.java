
import java.util.Scanner;

/**
 * You will be given a single integer. Your task is to find the sum of its digits.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        scanner.close();
    }
}
