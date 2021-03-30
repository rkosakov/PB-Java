import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int pages = Integer.parseInt(scan.nextLine());
        int pagesHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int hoursToRead = pages / pagesHour;
        int hoursADay = hoursToRead / days;

        System.out.println(hoursADay);
    }
}
