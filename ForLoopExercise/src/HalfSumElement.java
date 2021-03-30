import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scan.nextLine());
            if (number > maxNum) {
                maxNum = number;

            }
            sum += number;
        }
        sum -= maxNum;

        if (sum == maxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - maxNum));
        }
    }
}
