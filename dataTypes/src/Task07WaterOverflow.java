
import java.util.Scanner;

/**
 * You have a water tank with a capacity of 255 liters.
 * On the next n lines, you will receive liters of water, which you have to pour into your tank.
 * If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line.
 * On the last line, print the liters in the tank.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int filled = 0;
        for (int i = 0; i < n; i++) {
            int pouring = Integer.parseInt(scanner.nextLine());
            if (pouring <= 255 - filled) {
                filled += pouring;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(filled);
        scanner.close();
    }
}
