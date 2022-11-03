
import java.util.Scanner;

/**
 * Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
 * The input holds two lines: the number of people n and the capacity p of the elevator.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int courses = (int) Math.ceil((double) n / p);
        System.out.println(courses);
        scanner.close();
    }
}
