import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double totalSum = 0;
        int gradeCount = 0;

        String topic = scan.nextLine();

        while (!topic.equals("Finish")) {

            double gradeSum = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                gradeSum += grade;
                gradeCount++;
            }
            System.out.printf("%s - %.2f.%n", topic, gradeSum / n);
            totalSum += gradeSum;

            topic = scan.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalSum / gradeCount);
    }
}
