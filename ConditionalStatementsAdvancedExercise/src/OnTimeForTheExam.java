import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int arrivalHour = Integer.parseInt(scan.nextLine());
        int arrivalMinute = Integer.parseInt(scan.nextLine());

        int minutesExam = examHour * 60 + examMinute;
        int minutesArrival = arrivalHour * 60 + arrivalMinute;
        String status = "";

        if (minutesExam < minutesArrival) {
            status = "Late";
        } else if ((minutesExam - minutesArrival) <= 30) {
            status = "On time";
        } else if ((minutesExam - minutesArrival) > 30) {
            status = "Early";
        }

        if (status.equals("Late")) {
            if ((minutesArrival - minutesExam) >= 60) {
                int minutesLate = minutesArrival - minutesExam;
                int hoursLate = minutesLate / 60;
                int minuteLate = minutesLate % 60;
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", hoursLate, minuteLate);

            } else {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minutesArrival - minutesExam);
            }
        } else if (status.equals("On time") && minutesExam == minutesArrival) {
            System.out.println("On time");
        } else if (status.equals("On time")) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Math.abs(minutesArrival - minutesExam));
        } else if (status.equals("Early")) {
            if ((minutesExam - minutesArrival) >= 60) {
                int minutesLate = Math.abs(minutesArrival - minutesExam);
                int hoursLate = minutesLate / 60;
                int minuteLate = minutesLate % 60;
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", hoursLate, minuteLate);

            } else {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", Math.abs(minutesArrival - minutesExam));
            }
        }
    }
}
