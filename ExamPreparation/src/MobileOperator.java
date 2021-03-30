import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String period = scan.nextLine();
        String contractType = scan.nextLine();
        String mobileData = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (period.equals("one")) {
            if (contractType.equals("Small")) {
                price = 9.98;
            } else if (contractType.equals("Middle")) {
                price = 18.99;
            } else  if (contractType.equals("Large")) {
                price = 25.98;
            } else if (contractType.equals("ExtraLarge")) {
                price = 35.99;
            }
        } else if (period.equals("two")) {
            if (contractType.equals("Small")) {
                price = 8.58;
            } else if (contractType.equals("Middle")) {
                price = 17.09;
            } else  if (contractType.equals("Large")) {
                price = 23.59;
            } else if (contractType.equals("ExtraLarge")) {
                price = 31.79;
            }
        }


        if (mobileData.equals("yes")) {

            if (price <= 10.00) {
                price += 5.50;
            } else if (price <= 30.00) {
                price += 4.35;
            } else {
                price += 3.85;
            }
        }



        if (period.equals("two")) {
            price -= price * 0.0375;
        }
        double totalPrice = price * months;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
