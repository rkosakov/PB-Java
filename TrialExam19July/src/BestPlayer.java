import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        String bestPlayer = "";
        int maxGoals = Integer.MIN_VALUE;
        boolean isThereHatTrick = false;

        while(!(input = scan.nextLine()).equals("END")) {

            int goals = Integer.parseInt(scan.nextLine());

            if (goals > maxGoals) {
                bestPlayer = input;
                maxGoals = goals;
            }
            if (goals >= 3) {
                isThereHatTrick = true;
            }

            if (goals >= 10) {
                System.out.printf("%s is the best player!%n", input);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
                return;
            }
        }

        if (isThereHatTrick) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals.%n", maxGoals);

        }


    }
}
