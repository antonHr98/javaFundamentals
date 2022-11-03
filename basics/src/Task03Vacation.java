
import java.util.Scanner;

/**
 * You are given a group of people, type of the group, on which day of the week they are going to stay.
 * Based on that information calculate how much they have to pay and print that price on the console. Use the
 * table below. In each cell is the price for a single person. The output should look like that:
 * "Total price: {price}". The price should be formatted to the second decimal point.
 * There are also discounts based on some conditions:
 *  Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
 *	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
 *  Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%
 *
 * You should reduce the prices in that EXACT order.
 *
 * @author Anton Hristov
 * @since 06.03.2022
 */

public class Task03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPpl = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        switch (type) {
            case "Students": {
                if (day.equals("Friday")) {
                    price = numberPpl * 8.45;
                } else if (day.equals("Saturday")) {
                    price = numberPpl * 9.8;
                } else if (day.equals("Sunday")) {
                    price = numberPpl * 10.46;
                } else {
                    System.out.println("Invalid day of the week.");
                }
                if (numberPpl >= 30) {
                    price -= price * 0.15;
                }
                System.out.printf("Total price: %.2f", price);
                break;
            }
            case "Business": {
                if (numberPpl >= 100) {
                    numberPpl -= 10;
                }
                if (day.equals("Friday")) {
                    price = numberPpl * 10.9;
                } else if (day.equals("Saturday")) {
                    price = numberPpl * 15.6;
                } else if (day.equals("Sunday")) {
                    price = numberPpl * 16;
                } else {
                    System.out.println("Invalid day of the week.");
                }
                System.out.printf("Total price: %.2f", price);
                break;
            }
            case "Regular": {
                if (day.equals("Friday")) {
                    price = numberPpl * 15;
                } else if (day.equals("Saturday")) {
                    price = numberPpl * 20;
                } else if (day.equals("Sunday")) {
                    price = numberPpl * 22.5;
                } else {
                    System.out.println("Invalid day of the week.");
                }
                if (numberPpl >= 10 && numberPpl <= 20) {
                    price -= price * 0.05;
                }
                System.out.printf("Total price: %.2f", price);
                break;
            }
            default: {
                System.out.println("Error!");
            }
        }
        scanner.close();
    }
}
