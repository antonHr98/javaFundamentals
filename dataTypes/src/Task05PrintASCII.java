
import java.util.Scanner;

/**
 * Write a program that prints part of the ASCII table of characters at the console.
 * On the first line of input, you will receive the char index you should start with, and on the
 * second line - the index of the last character you should print.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task05PrintASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputStart = Integer.parseInt(scanner.nextLine());
        int inputFinish = Integer.parseInt(scanner.nextLine());
        for (int i = inputStart; i <= inputFinish; i++) {
            char letter = (char) i;
            System.out.printf("%c ", letter);
        }
        scanner.close();
    }
}
