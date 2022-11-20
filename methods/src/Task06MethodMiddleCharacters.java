
import java.util.Scanner;

/**
 *
 * You will receive a single string. Write a method that prints the middle character.
 * If the length of the string is even, there are two middle characters.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task06MethodMiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(PrintMiddleCharactersInString(input));
        scanner.close();
    }

    public static String PrintMiddleCharactersInString(String input) {
        String output;
        if (input.length() % 2 == 0) {
            String midLeft = Character.toString(input.charAt(input.length() / 2 - 1));
            String midRight = Character.toString(input.charAt(input.length() / 2));
            output = midLeft + midRight;
        } else {
            output = Character.toString(input.charAt(input.length() / 2));
        }
        return output;
    }
}
