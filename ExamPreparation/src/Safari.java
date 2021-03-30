import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double litersFuel = Double.parseDouble(scan.nextLine());
        String day = scan.nextLine();

        double fuelPrice = litersFuel * 2.10;
        double total = fuelPrice + 100;

        if (day.equals("Saturday")) {
            total -= total * 0.10;
        } else if (day.equals("Sunday")) {
            total -= total * 0.20;
        }

        if (budget >= total) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - total);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", total - budget);
        }
    }
}
