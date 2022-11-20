
import java.util.Scanner;

/**
 *
 * Write a method that receives a single string and prints the count of the vowels.
 * Use an appropriate name for the method.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task02MethodVowelCounterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = VowelCounterInput(scanner.nextLine());
        System.out.println(result);
        scanner.close();
    }

    public static int VowelCounterInput(String input) {
        int numVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'I' || input.charAt(i) == 'E' || input.charAt(i) == 'O' || input.charAt(i) == 'U' || input.charAt(i) == 'Y'
             || input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 'y') {
                numVowels++;
            }
        }
        return numVowels;
    }
}
