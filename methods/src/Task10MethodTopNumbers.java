
import java.util.*;

/**
 *
 * Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
 * A top number holds the following properties:
 * · Its sum of digits is divisible by 8, e.g. 8, 16, 88.
 * · Holds at least one odd digit, e.g. 232, 707, 87578.
 *      
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task10MethodTopNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<Integer> topNumbers = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (ReturnSumOfDigits(i) % 8 == 0 && HasOneOrMoreOddDigits(i)) {
                topNumbers.add(i);
            }
        }
        Collections.sort(topNumbers);
        ListToIntArr(topNumbers);
        scanner.close();
    }

    public static boolean HasOneOrMoreOddDigits(int number) {
        boolean isTrue = false;
        while (number != 0) {
            if ((number % 10) % 2 == 1) {
                isTrue = true;
                break;
            }
            number /= 10;
        }
        return isTrue;
    }

    public static int ReturnSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void ListToIntArr(List<Integer> givenList) {
        int[] arr = new int[givenList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = givenList.get(i);
            System.out.println(arr[i]);
        }
    }
}

