
import java.util.Scanner;

/**
 *
 * Read two integer numbers. Calculate the factorial of each number.
 * Divide the first result by the second and print the division formatted to the second decimal point
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task08MethodFactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1Fac = PrintFactorialOfNumber(scanner.nextInt());
        long num2Fac = PrintFactorialOfNumber(scanner.nextInt());
        double result = num1Fac / (double) num2Fac;
        System.out.printf("%.2f", result);
        scanner.close();
    }

    public static long PrintFactorialOfNumber(int number) {
        long factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
