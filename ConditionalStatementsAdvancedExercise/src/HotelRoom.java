import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October") ) {
            priceStudio = 50;
            priceApartment = 65;
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.20;
            priceApartment = 68.70;
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
        }
        if (nights > 7 && nights <= 14 && (month.equals("May") || month.equals("October"))) {
            priceStudio -= priceStudio * 0.05;
        }
         if (nights > 14 && (month.equals("May") || month.equals("October"))) {
            priceStudio -= priceStudio * 0.30;
        }
         if (nights > 14 && (month.equals("June") || month.equals("September"))) {
             priceStudio -= priceStudio * 0.20;
         }
         if (nights > 14){
             priceApartment -= priceApartment * 0.10;
         }
        System.out.printf("Apartment: %.2f lv.\n", (nights * priceApartment));
        System.out.printf("Studio: %.2f lv.", (nights * priceStudio));

                     // Май и октомври	    Юни и септември	                 Юли и август
       // Студио –        50 лв./нощувка	Студио – 75.20 лв./нощувка	    Студио – 76 лв./нощувка
       // Апартамент –    65 лв./нощувка	Апартамент – 68.70 лв./нощувка	Апартамент – 77 лв./нощувка

    }
}
