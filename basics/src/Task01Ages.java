
import java.util.Scanner;

/**
 * Write a program that determines whether based on the given age a person is: baby, child, teenager, adult, elder.
 * The bounders are:
 * 0-2 – baby;
 * 3-13 – child;
 * 14-19 – teenager;
 * 20-65 – adult;
 * >=66 – elder;
 * All the values are inclusive.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        if (age <= 2 && age >= 0) {
            System.out.println("baby");
        } else if (age <= 13 && age >= 3) {
            System.out.println("child");
        } else if (age <= 19 && age >= 14) {
            System.out.println("teenager");
        } else if (age <= 65 && age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
        scanner.close();
    }
}

