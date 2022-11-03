
import java.util.Scanner;

/**
 *
 * You will be given a count of wagons in a train n. On the next n lines, you will receive how many people are going to
 * get on that wagon. At the end print the whole train and after that the sum of the people on the train.
 *
 * @author Anton Hristov
 * @since 03.11.2022
 */

public class Task01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }
        for (int i = 0; i < train.length; i++) {
            if (i != train.length - 1) {
                System.out.printf("%d ", train[i]);
            } else System.out.printf("%d", train[i]);
        }
        System.out.println("\n" + sum);
        scanner.close();
    }
}
