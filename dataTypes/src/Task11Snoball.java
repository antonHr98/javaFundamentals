
import java.util.Scanner;

/**
 * Write a program that calculates snowball data and outputs the best snowball value.
 * You will receive N – an integer, the number of snowballs being made by Tony and Andi.
 * For each snowball you will receive 3 input lines:
 * On the first line, you will get the snowballSnow – an integer.
 * On the second line, you will get the snowballTime – an integer.
 * On the third line, you will get the snowballQuality – an integer.
 * For each snowball you must calculate its snowballValue by the following formula:
 * (snowballSnow / snowballTime) ^ snowballQuality
 * In the end, you must print the highest calculated snowballValue.
 *
 * @author Anton Hristov
 * @since 09.03.2022
 */

public class Task11Snoball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sbValue;
        double tempValue = 0;
        int tempSnow = 0;
        int tempTime = 0;
        int tempQlty = 0;
        for (int i = 0; i < n; i++) {
            int sbSnow = Integer.parseInt(scanner.nextLine());
            int sbTime = Integer.parseInt(scanner.nextLine());
            int sbQlty = Integer.parseInt(scanner.nextLine());
            sbValue = Math.pow(((1.0 * sbSnow) / sbTime), sbQlty);
            if (sbValue > tempValue) {
                tempValue = sbValue;
                tempSnow = sbSnow;
                tempTime = sbTime;
                tempQlty = sbQlty;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", tempSnow, tempTime, tempValue, tempQlty);
        scanner.close();
    }
}
