import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int rightSum = 0;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            int firstNumber = Integer.parseInt(scan.nextLine());
            rightSum += firstNumber;
        }
        for (int j = 1; j <= n; j++) {
            int secondNumber = Integer.parseInt(scan.nextLine());
            leftSum += secondNumber;
        }

        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", rightSum );
        }
        else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}
