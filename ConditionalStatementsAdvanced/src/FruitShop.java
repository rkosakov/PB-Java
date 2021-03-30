import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double price = 0;

        boolean isWorkingDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday");
        boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
        boolean isFruit = fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") || fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes");

        if (isWorkingDay) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                System.out.println("error");
            }
        } else if (isWeekend) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        if (isWeekend || isWorkingDay && isFruit) {
            System.out.printf("%.2f", (price * quantity));
        }


    }
}
