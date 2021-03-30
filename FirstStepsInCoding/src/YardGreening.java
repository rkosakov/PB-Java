import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double meters = Double.parseDouble(scan.nextLine());
        double price = 7.61 * meters;
        double discount = price * 0.18;
        double total = price - discount;

        System.out.printf("The final price is: %.2f lv.\n", total);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
