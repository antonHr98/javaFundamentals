
import java.util.Scanner;

/**
 * Read four integer numbers. Add first to the second, divide (integer) the sum by the third number, and multiply
 * the result by the fourth number. Print the result.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int result;
        result = num1 + num2;
        result /= num3;
        result *= num4;
        System.out.println(result);
        scanner.close();
    }
}
