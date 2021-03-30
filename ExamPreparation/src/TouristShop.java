import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String product = scan.nextLine();
        int productCounter = 0;
        int productsBought = 0;
        double productsCost = 0;

        while (!product.equals("Stop")) {

            double price = Double.parseDouble(scan.nextLine());
            productCounter++;

            if (productCounter % 3 == 0) {
                price *= 0.50;
                if (price > budget) {
                    System.out.printf("You don't have enough money!%nYou need %.2f leva!", price - budget);
                    return;
                }
            }
            if (budget < price) {
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", price - budget);
                return;
            }
            productsBought++;
            productsCost += price;
            budget -= price;
            product = scan.nextLine();
        }


        System.out.printf("You bought %d products for %.2f leva.", productsBought, productsCost);


    }
}
