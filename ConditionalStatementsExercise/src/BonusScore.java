import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        double points = 0;
        if (number <= 100) {
            points += 5;
        } else if (number > 100 && number <= 1000) {
            points = number * 0.2;
        } else if (number > 1000) {
            points = number * 0.1;
        }
        if (number % 2 == 0) {
            points += 1;
        }
        if (number % 10 == 5) {
            points += 2;
        }
        System.out.println(points);
        System.out.println(number + points);
    }
}
