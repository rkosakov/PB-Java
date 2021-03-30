import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = "";
        int standardCount = 0;
        int kidCount = 0;
        int studentCount = 0;
        int totalTicketCount = 0;

        while (!(movie = scan.nextLine()).equals("Finish")) {
            int capacity = Integer.parseInt(scan.nextLine());
            String type = "";
            int ticketsCount = 0;
            while(!(type = scan.nextLine()).equals("End")) {
                ticketsCount++;

                switch (type) {
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                    case "student":
                        studentCount++;
                        break;
                }
                if (ticketsCount >= capacity) {
                    break;
                }
            }
            totalTicketCount += ticketsCount;
            double seatsTaken = ticketsCount * 1.0 / capacity * 100;
            System.out.printf("%s - %.2f%% full.\n", movie, seatsTaken);

        }
        double studentTickets = studentCount * 1.0 / totalTicketCount * 100;
        double standardTickets = standardCount * 1.0 / totalTicketCount * 100;
        double kidTickets = kidCount * 1.0 / totalTicketCount * 100;


        System.out.printf("Total tickets: %d\n", totalTicketCount);
        System.out.printf("%.2f%% student tickets.\n", studentTickets);
        System.out.printf("%.2f%% standard tickets.\n", standardTickets);
        System.out.printf("%.2f%% kids tickets.\n", kidTickets);
    }

}
