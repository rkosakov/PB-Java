import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String feedback = scan.nextLine();
        double price = 0;

        int nights = days - 1;
        //вид помещение	         по-малко от 10 дни	   между 10 и 15 дни	повече от 15 дни
        //room for one person	 не ползва намаление    не ползва намаление	    не ползва намаление
        //apartment	             30% от крайната цена	35% от крайната цена	50% от крайната цена
        //president apartment	10% от крайната цена	15% от крайната цена	20% от крайната цена

        if (type.equals("room for one person")) {
            price = 18.00;
        } else if (type.equals("apartment")) {
            price = 25;
            if (days < 10) {
                price -= (price * 0.30);
            } else if (days >= 10 && days < 15) {
                price -= (price * 0.35);
            } else if (days > 15) {
                price -= (price * 0.50);
            }
        } else if (type.equals("president apartment")) {
            price = 35;
            if (days < 10) {
                price -= (price * 0.10);
            } else if (days >= 10 && days < 15) {
                price -= (price * 0.15);
            } else if (days > 15) {
                price -= (price * 0.20);
            }
        }

        double total = price * nights;

        if (feedback.equals("positive")) {
            total += (total * 0.25);
        } else if (feedback.equals("negative")) {
            total -= (total * 0.10);
        }

        System.out.printf("%.2f", total);


    }
}
