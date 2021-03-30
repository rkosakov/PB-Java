import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            area = Math.pow(side, 2);
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scan.nextLine());
            double sideB = Double.parseDouble(scan.nextLine());
            area = sideA * sideB;
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine());
            area = Math.pow(radius, 2) * Math.PI;
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            area = (side * height) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
