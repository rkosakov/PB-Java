import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String waysOfDelivery = scan.nextLine();

        double price = 0;

        if (count < 10) {
            System.out.println("Invalid order");
            return;
        }

        if (type.equals("90X130")) {

            price = 110;

            if (count > 60) {
                price -= price * 0.08;
            } else if (count > 30) {
                price -= price * 0.05;
            }
        } else if (type.equals("100X150")) {

            price = 140;

            if (count > 80) {
                price -= price * 0.10;
            } else if (count > 40) {
                price -= price * 0.06;
            }
        } else if (type.equals("130X180")) {

            price = 190;

            if (count > 50) {
                price -= price * 0.12;
            } else if (count > 20) {
                price -= price * 0.07;
            }
        } else if (type.equals("200X300")) {

            price = 250;

            if (count > 50) {
                price -= price * 0.14;
            } else if (count > 25) {
                price -= price * 0.09;
            }
        }

        double total = price * count;

        if (waysOfDelivery.equals("With delivery")) {
            total += 60;
        }

        if (count > 99) {
            total -= total * 0.04;
        }

        System.out.printf("%.2f BGN", total);


    }
}
