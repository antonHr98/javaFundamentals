
import java.util.Scanner;

/**
 *
 * Write a program that checks if a given password is valid. Password rules are:
 * · 6 – 10 characters (inclusive);
 * · Consists only of letters and digits;
 * · Have at least 2 digits.
 *
 * If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule print a message:
 * · "Password must be between 6 and 10 characters";
 * · "Password must consist only of letters and digits";
 * · "Password must have at least 2 digits".
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task04MethodPasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (!CheckIfStringLengthIsBetween6and10(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!CheckIfStringIsOnlyLetterAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!CheckIfStringIsAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (CheckIfStringIsAtLeast2Digits(password) && CheckIfStringIsOnlyLetterAndDigits(password) && CheckIfStringLengthIsBetween6and10(password)) {
            System.out.println("Password is valid");
        }
        scanner.close();
    }

    public static boolean CheckIfStringLengthIsBetween6and10(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean CheckIfStringIsOnlyLetterAndDigits(String password) {
        boolean condition = false;
        for (int i = 0; i < password.length(); i++) {
            int var = password.charAt(i);
            if ((var >= 48 && var <= 57) || (var >= 65 && var <= 90) || (var >= 97 && var <= 122)) {
                condition = true;
            } else {
                return false;
            }
        }
        return condition;
    }

    public static boolean CheckIfStringIsAtLeast2Digits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                counter++;
            }
        }
        return counter >= 2;
    }
}
