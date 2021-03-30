import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double trip = Double.parseDouble(scan.nextLine());
        int puzzle = Integer.parseInt(scan.nextLine());
        int doll = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minion = Integer.parseInt(scan.nextLine());
        int truck = Integer.parseInt(scan.nextLine());

        double total = puzzle * 2.6 + doll * 3 + bears * 4.1 + minion * 8.2 + truck * 2;
        int totalToys = puzzle + doll + bears + minion + truck;

        if (totalToys >= 50){
            total = total - (total * 0.25);
        }
        double rent = total * 0.10;
        total -= rent;

        if (trip <= total){
            System.out.printf("Yes! %.2f lv left.", (total - trip));
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", (trip - total));
        }

    }
}
