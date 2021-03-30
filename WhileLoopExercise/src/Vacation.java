import java.time.temporal.IsoFields;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double balance = Double.parseDouble(scan.nextLine());
        int daysCounter = 0;
        int spendDays = 0;


        while (balance < moneyNeeded) {

            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysCounter++;
            if (command.equals("save")) {
                balance += money;
                spendDays = 0;


            } else if (command.equals("spend")) {
                spendDays++;
                balance -= money;
                if (balance <= 0) {
                    balance = 0;
                }
                if (spendDays >= 5) {
                    System.out.printf("You can't save the money.\n%d", daysCounter);
                    return;
                }
            }


        }
        System.out.printf("You saved the money for %d days.", daysCounter);
    }
}
