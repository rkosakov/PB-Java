import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double sum = money + months * ((money * percent / 100) / 12);
        System.out.println(sum);

    }
}
