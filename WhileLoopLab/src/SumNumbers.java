import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int num = Integer.parseInt(scan.nextLine());

        while (sum <= number) {
            sum += num;
            if (sum >= number) {
                break;
            } else {
                num = Integer.parseInt(scan.nextLine());
            }

        }

        System.out.println(sum);
    }
}
