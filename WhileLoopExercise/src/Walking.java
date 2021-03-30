import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int totalSteps = 0;
        boolean isReached = false;

        while(!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= 10000) {
                System.out.printf("Goal reached! Good job!\n%d steps over the goal!\n", totalSteps - 10000);
                isReached = true;
                break;
            }
            input = scan.nextLine();

        }

        if (!isReached) {
            int stepsAfter = Integer.parseInt(scan.nextLine());
            totalSteps += stepsAfter;
            if (totalSteps >= 10000){
                System.out.printf("Goal reached! Good job!\n%d steps over the goal!\n", totalSteps - 10000);
            } else {
                System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
            }
        }

    }
}
