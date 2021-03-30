import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        int combinationCounter = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {

                combinationCounter++;

                if (i + j == number) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, i, j, number);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", combinationCounter, number);
    }
}
