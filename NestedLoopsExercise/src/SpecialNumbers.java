import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1111; i <= 9999; i ++) {
            int forthDigit = i / 1000;
            int thirdDigit = i / 100 % 10;
            int secondDigit = i / 10 % 10;
            int firstDigit = i % 10;

            boolean check1 = firstDigit != 0 && number % firstDigit == 0;
            boolean check2 = secondDigit != 0 && number % secondDigit == 0;
            boolean check3 = thirdDigit != 0 && number % thirdDigit == 0;
            boolean check4 = forthDigit != 0 && number % forthDigit == 0;

            if (check1 && check2 && check3 && check4) {
                System.out.printf("%d ", i );
            }

        }
    }
}
