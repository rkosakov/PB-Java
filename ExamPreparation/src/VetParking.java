import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double totalPay = 0;


        for (int i = 1; i <= days; i++) {
            double dailyPay = 0;
            for (int j = 1; j <= hours; j++) {
                double hourlyPay = 0;

                if (i % 2 == 0 && j % 2 != 0) {
                    hourlyPay += 2.50;
                } else  if (i % 2 != 0 && j % 2 == 0) {
                    hourlyPay += 1.25;
                } else {
                    hourlyPay = 1;
                }
                dailyPay += hourlyPay;
            }
            System.out.printf("Day: %d - %.2f leva%n", i, dailyPay);
            totalPay += dailyPay;
        }
        System.out.printf("Total: %.2f leva%n", totalPay);

    }
}
