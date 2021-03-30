import java.util.Scanner;

public class GraduationPT2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        boolean isFailed = false;
        int failCounter = 0;
        double sum = 0;
        int classCounter = 1;

        while(classCounter <= 12) {
            double grade = Double.parseDouble(scan.nextLine());

            if (grade >= 4.00) {
                sum += grade;
            } else if (grade <= 4.00) {
                failCounter++;
                if (failCounter == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, classCounter);
                    isFailed = true;
                    break;
                } else {
                    continue;
                }
            }

            classCounter++;
        }

        if (!isFailed) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }




    }
}
