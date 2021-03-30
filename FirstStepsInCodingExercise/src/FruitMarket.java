import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double priceStrawberries = Double.parseDouble (scan.nextLine());
        double bananas = Double.parseDouble(scan.nextLine());
        double oranges = Double.parseDouble(scan.nextLine());
        double raspberries = Double.parseDouble(scan.nextLine());
        double QStrawberries = Double.parseDouble((scan.nextLine()));

        double priceRaspberries = priceStrawberries - (0.5 * priceStrawberries);
        double priceOranges = priceRaspberries - (0.4 * priceRaspberries);
        double priceBananas = priceRaspberries - (0.8 * priceRaspberries);


        double totalStrawberries = QStrawberries * priceStrawberries;
        double totalBananas = bananas * priceBananas;
        double totalOranges = oranges * priceOranges;
        double totalRaspberries = raspberries * priceRaspberries;

        double total = totalStrawberries + totalBananas + totalOranges + totalRaspberries;

        System.out.printf("%.2f", total);


    }
}
