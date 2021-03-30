import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end; i++) {
           int firstDigit = i / 100000;
           int secondDigit = i / 10000 % 10;
           int thirdDigit = i / 1000 % 10;
           int fourthDigit = i / 100 % 10;
           int fifthDigit = i / 10 % 10;
           int sixthDigit = i % 10;

           int evenDigitSum = secondDigit + fourthDigit + sixthDigit;
           int oddDigitSum = firstDigit + thirdDigit + fifthDigit;

           if (evenDigitSum == oddDigitSum) {
               System.out.printf("%d ", i);
           }
        }
    }
}
