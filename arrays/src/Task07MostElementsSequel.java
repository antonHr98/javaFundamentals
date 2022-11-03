
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Write a program that finds the longest sequence of equal elements in an array of integers.
 * If several longest sequences exist, print the leftmost one.
 *
 * @author Anton Hristov
 * @since 03.11.2022
 */

public class Task07MostElementsSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxSequence = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1] && i != arr.length-1) {
                counter++;
            } else {
                if (counter > maxSequence) {
                    maxSequence = counter;
                }
                counter = 0;
            }
        }

        scanner.close();
    }
}
