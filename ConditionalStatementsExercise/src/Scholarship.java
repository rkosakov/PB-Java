import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double grade = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        double socialSch = 0;
        double gradeSch = 0;
        if (income < minSalary && grade > 4.5) {
            socialSch = 0.35 * minSalary;
        }
        if (grade >= 5.5) {
            gradeSch = 25 * grade;
        }
        if (socialSch == 0 && gradeSch == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialSch > gradeSch) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialSch));
        } else if (gradeSch >= socialSch) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeSch));
        }
    }
}
