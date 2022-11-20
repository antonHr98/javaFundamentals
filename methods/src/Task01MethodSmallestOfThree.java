
import java.util.Scanner;

/**
 *
 * Write a method to print the smallest of three integer numbers. Use an appropriate name for the method.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task01MethodSmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = PrintSmallestOf3Integers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(result);
        scanner.close();
    }

    public static int PrintSmallestOf3Integers(int num1, int num2, int num3) {
        int minInteger = Integer.MAX_VALUE;
        if (num1 < minInteger) {
            minInteger = num1;
        }
        if (num2 < minInteger) {
            minInteger = num2;
        }
        if (num3 < minInteger) {
            minInteger = num3;
        }
        return minInteger;
    }
}
