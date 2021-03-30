import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double clothing = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;
        double totalClothing = people * clothing;

        if (people > 150) {
            totalClothing = totalClothing - (totalClothing * 0.10);
        }
        double total = decor + totalClothing;

        if (budget >= total){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        }
    }
}
