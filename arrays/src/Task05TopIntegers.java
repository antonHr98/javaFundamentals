
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Write a program to find all the top integers in an array.
 * A top integer is an integer that is bigger than all the elements to its right.
 *
 * @author Anton Hristov
 * @since 03.11.2022
 */

public class Task05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            int check = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (check < arr[j] && j > i) {
                    arr[i] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        scanner.close();
    }
}
