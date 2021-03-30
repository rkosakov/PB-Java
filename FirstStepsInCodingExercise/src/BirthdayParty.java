import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int rent = Integer.parseInt(scan.nextLine());
        double cake = 0.2 * rent * 1.0;
        double refreshments = cake - cake * 0.45;
        double animator = rent * 1/3;

        double total = rent + cake + refreshments + animator;
        System.out.println(total);
    }
}
