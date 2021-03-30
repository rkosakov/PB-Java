import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int volume = length * width * height;
        double volumeLiters = volume * 0.001;
        double p = percent * 0.01;
        double liters = volumeLiters * (1-p);

        System.out.printf("%.2f", liters);
    }
}
