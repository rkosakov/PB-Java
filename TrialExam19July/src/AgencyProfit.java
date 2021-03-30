import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String airline = scan.nextLine();
        int adultTicketCount = Integer.parseInt(scan.nextLine());
        int childTicketsCount = Integer.parseInt(scan.nextLine());
        double priceAdultTicket = Double.parseDouble(scan.nextLine());
        double operationFee = Double.parseDouble(scan.nextLine());

        double priceChildTicket = 0.30 * priceAdultTicket;
        double totalPriceForAdults = priceAdultTicket + operationFee;
        double totalPriceForChildren = priceChildTicket + operationFee;

        double grossProfit = adultTicketCount * totalPriceForAdults + childTicketsCount * totalPriceForChildren;

        double netProfit = grossProfit * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, netProfit);



    }
}
