
import java.util.Scanner;

/**
 *
 * Write a method that receives a single integer n and prints nxn matrix with that number.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task07MethodNxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.print(PrintNxNMatrixFromInt(number));
        scanner.close();
    }

    public static String PrintNxNMatrixFromInt(int number) {
        String numberString = number + " ";
        for (int i = 0; i < number - 1; i++) {
            if (i != number - 2) {
                numberString = numberString + number + " ";
            } else {
                numberString = numberString + number;
            }
        }
        String output = numberString;
        for (int i = 0; i < number - 1; i++) {
                output = output + "\n" + numberString;
        }
        return output;
    }
}
