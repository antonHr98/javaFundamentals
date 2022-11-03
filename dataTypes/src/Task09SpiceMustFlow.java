
import java.util.Scanner;

/**
 * Write a program that calculates the total amount of spice that can be extracted from a source.
 * The source has a starting yield, which indicates how much spice can be mined on the first day. After it has been
 * mined for a day, the yield drops by 10, meaning on the second day it’ll produce 10 less spice than on the first,
 * on the third day 10 less than on the second, and so on (see examples).
 * A source is considered profitable only while its yield is at least 100 – when less than 100 spices are expected in
 * a day, abandon the source.
 * The mining crew consumes 26 spices every day at the end of their shift and an additional 26 after the mine has been
 * exhausted. Note that the workers cannot consume more spice than there is in storage.
 * When the operation is complete, print on the console on two separate lines how many days the mine has operated and
 * the total amount of spice extracted.
 *
 * @author Anton Hristov
 * @since 07.03.2022
 */

public class Task09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yieldMine = Integer.parseInt(scanner.nextLine());
        int extracted = 0;
        int days = 0;
        while (yieldMine >= 100) {
            extracted += yieldMine - 26;
            yieldMine -= 10;
            days++;
        }
        if (extracted >= 26) {
            extracted -= 26;
        }
        System.out.println(days + "\n" + extracted);
        scanner.close();
    }
}
