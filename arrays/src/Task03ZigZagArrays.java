
import java.util.Scanner;

/**
 *
 * Write a program that creates 2 arrays. You will be given an integer n. On the next n lines, you get 2 integers.
 * Form 2 arrays as shown below.
 *
 * @author Anton Hristov
 * @since 03.11.2022
 */

public class Task03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        byte shift = 0;
        for (int i = 0; i < n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (shift % 2 == 0) {
                arr1[i] = num1;
                arr2[i] = num2;
            } else {
                arr1[i] = num2;
                arr2[i] = num1;
            }
            shift++;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr2[i]);
        }
        scanner.close();
    }
}
