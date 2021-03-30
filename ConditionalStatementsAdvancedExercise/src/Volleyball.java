import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        int holidays = Integer.parseInt(scan.nextLine());
        int weekendsHome = Integer.parseInt(scan.nextLine());

        double weekendsSofia = 48 - weekendsHome;
        double weekendsPlayingSofia = weekendsSofia * (3.0 / 4.0);
        double holidaysPlaying = holidays * (2.0 / 3.0);

        double total = weekendsPlayingSofia + weekendsHome + holidaysPlaying;

        if (year.equals("leap")) {
            total += total * 0.15;
        }
        System.out.printf("%.0f", Math.floor(total));


    }
}
