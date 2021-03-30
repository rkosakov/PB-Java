import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());
        double rent = 0.0;

        if (season.equals("Spring")) {
            rent = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            rent = 4200;
        } else if (season.equals("Winter")) {
            rent = 2600;
        }
        if (fishermen <= 6) {
            rent -= rent * 0.10;
        } else if (fishermen > 7 && fishermen <= 11) {
            rent -= rent * 0.15;
        } else if (fishermen > 12) {
            rent -= rent * 0.25;
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            rent -= rent * 0.05;
        }

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - rent));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (rent - budget));
        }

    }
}
