
import java.util.Scanner;

/**
 *
 * Write a program that receives an array and the number of rotations you have to perform
 * (the first element goes at the end) Print the resulting array.
 *
 * @author Anton Hristov
 * @since 03.11.2022
 */

public class Task04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        int revolutions = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < revolutions; j++) {
            String firstElement = arr1[0];
            for (int i = 0; i < arr1.length - 1; i++) {
                arr1[i] = arr1[i + 1];
            }
            arr1[arr1.length - 1] = firstElement;
        }
        System.out.print(String.join(" ", arr1));
        scanner.close();
    }
}
