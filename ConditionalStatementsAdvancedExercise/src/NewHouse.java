import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        double price = 0;
        //цвете	               Роза	Далия	Лале Нарцис	Гладиола
        //Цена на брой в лева	5	3.80	2.80	3	2.50


        switch (flower) {
            case "Roses":
                price = 5;
                if (number > 80) {
                    price -= 5 * 0.10;
                }
                break;
            case "Dahlias":
                price = 3.80;
                if (number > 90) {
                    price -= 3.80 * 0.15;
                }
                break;
            case "Tulips":
                price = 2.80;
                if (number > 80) {
                    price -= 2.80 * 0.15;
                }
                break;
            case "Narcissus":
                price = 3;
                if (number < 120) {
                    price += 3 * 0.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if (number < 80) {
                    price += 2.50 * 0.20;
                }
        }

        double total = price * number;

        if (total > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", (total - budget));
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, (budget - total));
        }
    }
}
