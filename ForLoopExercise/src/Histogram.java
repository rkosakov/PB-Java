import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 200) {
                n1++;
            } else if (number >= 200 && number <= 399) {
                n2++;
            } else if (number >= 400 && number <= 599) {
                n3++;
            } else if (number >= 600 && number <= 799) {
                n4++;
            } else if (number >= 800) {
                n5++;
            }

        }

        double p1 = n1 * 1.0 / n * 100;
        double p2 = n2 * 1.0 / n * 100;
        double p3 = n3 * 1.0 / n * 100;
        double p4 = n4 * 1.0 / n * 100;
        double p5 = n5 * 1.0 / n * 100;

        System.out.printf("%.2f%%\n", p1);
        System.out.printf("%.2f%%\n", p2);
        System.out.printf("%.2f%%\n", p3);
        System.out.printf("%.2f%%\n", p4);
        System.out.printf("%.2f%%", p5);
    }
}
