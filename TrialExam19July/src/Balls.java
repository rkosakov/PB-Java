import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int points = 0;
        int othersCount = 0;

        for (int i = 1; i <= number; i++) {

            String color = scan.nextLine();

            switch (color) {
                case "red":
                    redCount++;
                    points += 5;
                    break;
                case "orange":
                    orangeCount++;
                    points += 10;
                    break;
                case "yellow":
                    yellowCount++;
                    points += 15;
                    break;
                case "white":
                    whiteCount++;
                    points += 20;
                    break;
                case "black":
                    blackCount++;
                    points /= 2;
                    break;
                default:
                    othersCount++;
                    continue;

            }

        }

        System.out.printf("Total points: %d%n", points);
        System.out.printf("Points from red balls: %d%n", redCount);
        System.out.printf("Points from orange balls: %d%n", orangeCount);
        System.out.printf("Points from yellow balls: %d%n", yellowCount);
        System.out.printf("Points from white balls: %d%n", whiteCount);
        System.out.printf("Other colors picked: %d%n", othersCount);
        System.out.printf("Divides from black balls: %d%n", blackCount);
    }
}
