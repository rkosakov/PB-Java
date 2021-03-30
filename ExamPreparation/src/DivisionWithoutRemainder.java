import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = Integer.parseInt(scan.nextLine());
        int divisibleBy3 = 0;
        int divisibleBy2 = 0;
        int divisibleBy4 = 0;

        for (int i = 1; i <= numbers; i++) {

            int number = Integer.parseInt(scan.nextLine());

            if (number % 3 == 0) {
                divisibleBy3++;
            }
            if (number % 2 == 0) {
                divisibleBy2++;
            }
            if (number % 4 == 0) {
                divisibleBy4++;
            }
        }

        double percentDivisibleBy3 = (double) divisibleBy3 / numbers * 100;
        double percentDivisibleBy2 = (double) divisibleBy2 / numbers * 100;
        double percentDivisibleBy4 = (double) divisibleBy4 / numbers * 100;

        System.out.printf("%.2f%%%n", percentDivisibleBy2);
        System.out.printf("%.2f%%%n", percentDivisibleBy3);
        System.out.printf("%.2f%%%n", percentDivisibleBy4);
    }
}
