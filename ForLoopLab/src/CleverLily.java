import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double priceLaundryMachine = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());

        int toysNumber = 0;
        int money = 10;
        int totalMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                totalMoney += money;
                money += 10;
                totalMoney -= 1.0;
            } else {
                toysNumber++;
            }
        }
        totalMoney += toysNumber * priceToy;

        if (totalMoney >= priceLaundryMachine) {
            System.out.printf("Yes! %.2f", (totalMoney - priceLaundryMachine));
        }
        else {
            System.out.printf("No! %.2f", (priceLaundryMachine - totalMoney));
        }


    }
}
