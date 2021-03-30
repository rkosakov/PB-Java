import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sec1 = Integer.parseInt(scan.nextLine());
        int sec2 = Integer.parseInt(scan.nextLine());
        int sec3 = Integer.parseInt(scan.nextLine());

        int totalSec = sec1 + sec2 + sec3;
        int min = totalSec / 60;
        int sec = totalSec % 60;

        if (sec < 10) {
            System.out.println(min + ":" + "0" + sec);
        } else {
            System.out.println(min + ":" + sec);
        }
    }
}
