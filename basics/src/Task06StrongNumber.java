
import java.util.Scanner;
/**
 * Write a program to check if a given number is a strong number or not. A number is strong if the sum of the Factorial
 * of each digit is equal to the number. For example 145 is a strong number, because 1! + 4! + 5! = 145. Print "yes"
 * if the number is strong and "no" if the number is not strong.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberS = scanner.nextLine();
        int baseNumber = Integer.parseInt(numberS);
        int number = baseNumber;
        int factorial = 1;
        int sum = 0;
        for (int i = 0; i < numberS.length(); i++) {
            for (int j = number % 10; j > 0; j--) {
                factorial *= j;
            }
            sum += factorial;
            number /= 10;
            factorial = 1;
        }
        if (sum == baseNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }
}
