
import java.util.Scanner;

/**
 * Write a program, which calculates the volume of n beer kegs.
 * You will receive in total 3 * n lines. Every three lines will hold information for a single keg.
 * First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
 * Calculate the volume using the following formula: π * r^2 * h.
 * In the end, print the model of the biggest keg.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfKegs = Integer.parseInt(scanner.nextLine());
        int volume = 0;
        String biggestKeg = "Error.";
        for (int i = 0; i < numOfKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double nextVolume = Math.PI * (radius * radius) * height;
            if (nextVolume > volume) {
                volume += nextVolume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
        scanner.close();
    }
}
