import java.util.Scanner;

/**
 *
 * Write a program, which prints common elements in two arrays. You have to compare the elements of the second array to
 * the elements of the first.
 *
 * @author Anton Hristov
 * @since 03.11.2022
 */

public class Task02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (String two : arr2) {
            for (String one : arr1) {
                if (two.equals(one)) {
                    System.out.printf("%s ",one);
                }
            }
        }
        scanner.close();
    }
}
