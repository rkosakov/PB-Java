import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());

            if (number % 2 == 0) {
                n1++;
            }
            if (number % 3 == 0) {
                n2++;
            }
            if (number % 4 == 0) {
                n3++;
            }
        }

        double p1 = n1 * 1.0 / n * 100;
        double p2 = n2 * 1.0 / n * 100;
        double p3 = n3 * 1.0 / n * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
    }
}
