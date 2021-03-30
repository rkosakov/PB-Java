import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int unsatisfactoryProblems = Integer.parseInt(scan.nextLine());
        int unsatisfactoryCounter = 0;
        String lastProblem = "";
        int sum = 0;
        int gradeCounter =0;

        String problemName = scan.nextLine();

        while(!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());
            gradeCounter++;

            if (grade <= 4) {
                unsatisfactoryCounter++;
                sum += grade;
                if (unsatisfactoryCounter == unsatisfactoryProblems) {
                    System.out.printf("You need a break, %d poor grades.", unsatisfactoryCounter);
                    return;
                }
            } else {
                sum += grade;
                lastProblem = problemName;

            }
            problemName = scan.nextLine();
        }

        System.out.printf("Average score: %.2f\n", sum * 1.0 / gradeCounter );
        System.out.printf("Number of problems: %d\n", gradeCounter);
        System.out.printf("Last problem: %s", lastProblem);
    }
}
