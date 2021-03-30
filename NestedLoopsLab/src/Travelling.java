import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();


        while (!destination.equals("End")) {

            double budget = Double.parseDouble(scan.nextLine());
            double initialBudget = 0;
            while (budget > initialBudget) {

                double money = Double.parseDouble(scan.nextLine());
                initialBudget += money;
            }

            System.out.printf("Going to %s!", destination);
            System.out.println();
            destination = scan.nextLine();
        }
    }
}
