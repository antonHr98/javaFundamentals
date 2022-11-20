
import java.util.Scanner;

/**
 *
 * You will receive 3 integers. Write a method sum to get the sum of the first two integers and subtract the method
 * that subtracts the third integer from the result from the sum method.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task05MethodAddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int result = SubtractOfInteger(SumOfTwoIntegers(num1, num2), num3);
        System.out.println(result);
        scanner.close();
    }

    public static int SumOfTwoIntegers(int num1, int num2) {
        return num1 + num2;
    }

    public static int SubtractOfInteger(int num1, int num2) {
        return num1 - num2;
    }
}
