import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        double moneyInCoins = Math.floor(money * 100);
        int coinsNumber = 0;

        while (moneyInCoins > 0) {

            if (moneyInCoins >= 200) {
                moneyInCoins -= 200;
                coinsNumber++;
            } else if (moneyInCoins >= 100) {
                moneyInCoins -= 100;
                coinsNumber++;
            } else if (moneyInCoins >= 50) {
                moneyInCoins -= 50;
                coinsNumber++;
            } else if (moneyInCoins >= 20) {
                moneyInCoins -= 20;
                coinsNumber++;
            } else if (moneyInCoins >= 10) {
                moneyInCoins -= 10;
                coinsNumber++;
            } else if (moneyInCoins >= 5) {
                moneyInCoins -= 5;
                coinsNumber++;
            } else if (moneyInCoins >= 2) {
                moneyInCoins -= 2;
                coinsNumber++;
            } else if (moneyInCoins >= 1) {
                moneyInCoins -= 1;
                coinsNumber++;
            }
        }

        System.out.println(coinsNumber);
    }
}
