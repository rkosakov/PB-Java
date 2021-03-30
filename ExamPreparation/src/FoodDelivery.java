import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scan.nextLine());
        int fishMenu = Integer.parseInt(scan.nextLine());
        int vegetarianMenu = Integer.parseInt(scan.nextLine());

        double total = 10.35 * chickenMenu + 12.40 * fishMenu + 8.15 * vegetarianMenu;

        total += total * 0.20;
        double totalWithDelivery = total + 2.50;

        System.out.printf("Total: %.2f", totalWithDelivery);
    }
}
