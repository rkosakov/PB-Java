import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double percent = 0.0;

        //Град	0 ≤ s ≤ 500	 500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
        //Sofia 	5%	           7%	                8%	          12%
        //Varna	   4.5%	           7.5%	                10%	          13%
        //Plovdiv	5.5%	       8%	                12%	          14.5%

        if (town.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                percent = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                percent = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 0.08;
            } else if (sales > 10000) {
                percent = 0.12;
            } else {
                System.out.println("error");
            }
        }
        if (town.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                percent = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                percent = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 0.10;
            } else if (sales > 10000) {
                percent = 0.13;
            } else {
                System.out.println("error");
            }
        }
        if (town.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                percent = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                percent = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                percent = 0.12;
            } else if (sales > 10000) {
                percent = 0.145;
            } else {
                System.out.println("error");
            }
        }
        else if (!(town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv"))) {
            System.out.println("error");
        }
        if ((town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv")) && sales > 0)
        System.out.printf("%.2f", sales * percent );


    }
}
