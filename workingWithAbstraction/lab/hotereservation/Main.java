package workingWithAbstraction.lab.hotereservation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalPrice;

        String[] tokens = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(tokens[0]);
        int numberOfDays = Integer.parseInt(tokens[1]);

        Seasons season = Seasons.valueOf(tokens[2]);
        Discounts discountType = Discounts.valueOf(tokens[3]);

        pricePerDay *= season.getPricePerDay();
        double percent = (pricePerDay * numberOfDays)  * discountType.getPercent() / 100;
        totalPrice = pricePerDay * numberOfDays - percent;
        System.out.printf("%.2f", totalPrice);

    }
}
