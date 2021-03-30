import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceLuggage = Double.parseDouble(scan.nextLine());
        double kilograms = Double.parseDouble(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int numberOfLuggage = Integer.parseInt(scan.nextLine());
        double priceAdded = 0;

        if (kilograms < 10) {
            priceAdded = priceLuggage * 0.20;
        } else if (kilograms >= 10 && kilograms <= 20) {
            priceAdded = priceLuggage / 2;
        } else {
             priceAdded = priceLuggage;
        }

        if (days > 30) {
            priceAdded += priceAdded * 0.10;
        } else if (days >= 7 && days <= 30) {
            priceAdded += priceAdded * 0.15;
        } else {
            priceAdded += priceAdded * 0.40;
        }

        double total = numberOfLuggage * priceAdded;

        System.out.printf("The total price of bags is: %.2f lv.", total);
    }
}
