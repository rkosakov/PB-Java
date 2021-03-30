import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int days = Integer.parseInt(scan.nextLine());
        int chefs = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakesMoney = cakes * 45;
        double wafflesMoney = waffles * 5.80;
        double pancakesMoney = pancakes * 3.20;

        double total = (cakesMoney + wafflesMoney + pancakesMoney) * days * chefs;
        double totalAfterExpenses = total - (total * 1/8);

        System.out.printf("%.2f", totalAfterExpenses);

    }
}
