
import java.util.Scanner;

/**
 * You will be given a string representing a username. The password will be that username reversed. Until you receive
 * the correct password print on the console "Incorrect password. Try again.". When you receive the correct password
 * print "User {username} logged in." However on the fourth try if the password is still not correct print
 * "User {username} blocked!" and end the program.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder();
        String user = scanner.nextLine();
        for (int i = user.length() - 1; i >= 0; i--) {
            password.append(user.charAt(i));
        }
        String input = scanner.nextLine();
        int counter = 0;
        if (input.equals(password.toString())) {
            System.out.printf("User %s logged in.", user);
        } else {
            while (!input.equals(password.toString()) && counter < 3) {
                System.out.println("Incorrect password. Try again.");
                counter++;
                input = scanner.nextLine();
            }
            if (!input.equals(password.toString())) {
                System.out.printf("User %s blocked!", user);
            } else {
                System.out.printf("User %s logged in.", user);
            }
        }
        scanner.close();
    }
}
