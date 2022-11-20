
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A palindrome is a number that reads the same backward as forward, such as 323 or 1001.
 * Write a program that reads a positive integer number until you receive "END".
 * For each numbered print whether the number is palindrome or not.
 *
 * @author Anton Hristov
 * @since 20.11.2022
 */

public class Task09MethodPalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            int num = Integer.parseInt(input);
            if (NumIsPalindrome(num)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
        scanner.close();
    }

    public static boolean NumIsPalindrome(int number) {
        String numberStr = Integer.toString(number);
        int[] numbersArr = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            numbersArr[i] = number % 10;
            number /= 10;
        }
        boolean isEven = numbersArr.length % 2 == 0;
        boolean isOdd = numbersArr.length % 2 == 1;
        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();
        for (int i = 0; i < numbersArr.length; i++) {
            if (isEven) {
                if (i < numbersArr.length / 2) {
                    leftSide.add(numbersArr[i]);
                } else {
                    rightSide.add(numbersArr[i]);
                }
            } else if (isOdd) {
                if (i < numbersArr.length / 2) {
                    leftSide.add(numbersArr[i]);
                } else if (i > numbersArr.length / 2) {
                    rightSide.add(numbersArr[i]);
                }
            }
        }
        Collections.reverse(rightSide);
        int differance = 0;
        for (int i=0;i< rightSide.size();i++){
            if (!rightSide.get(i).equals(leftSide.get(i))){
                differance++;
            }
        }
        return differance <= 0;
    }
}