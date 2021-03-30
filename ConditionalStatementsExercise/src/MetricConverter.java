import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();
        double calc = 0;

        if (input.equals("mm") && output.equals("m")) {
            calc = n / 1000;
        } else if (input.equals("m") && output.equals("mm")) {
            calc = n * 1000;
        } else if (input.equals("m") && output.equals("cm")) {
            calc = n * 100;
        } else if (input.equals("cm") && output.equals("m")) {
            calc = n / 100;
        } else if (input.equals("cm") && output.equals("mm")) {
            calc = n * 10;
        } else if (input.equals("mm") && output.equals("cm")) {
            calc = n / 10;
        }
        System.out.printf("%.3f", calc);


    }
}
