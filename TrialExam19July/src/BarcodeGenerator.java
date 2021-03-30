import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        int firstNumberFourthDigit = start / 1000;
        int firstNumberThirdDigit = start / 100 % 10;
        int firstNumberSecondDigit = start / 10 % 10;
        int firstNumberFirstDigit = start % 10;

        int secondNumberFourthDigit = end / 1000;
        int secondNumberThirdDigit = end / 100 % 10;
        int secondNumberSecondDigit = end / 10 % 10;
        int secondNumberFirstDigit = end % 10;

        for (int i = firstNumberFourthDigit; i <= secondNumberFourthDigit; i++) {
            for (int j = firstNumberThirdDigit; j <= secondNumberThirdDigit; j++) {
                for (int k = firstNumberSecondDigit; k <= secondNumberSecondDigit; k++) {
                    for (int l = firstNumberFirstDigit; l <= secondNumberFirstDigit ; l++) {
                        if (i % 2!= 0 && j % 2 != 0 && k % 2 != 0 && l % 2 !=0 )
                        {
                            System.out.printf("%d%d%d%d ", i, j ,k, l);
                        }

                    }

                }

            }

        }






    }
}
