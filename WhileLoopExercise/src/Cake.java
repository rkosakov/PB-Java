import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        boolean isGone = false;

        int area = width * length;
        String command = scan.nextLine();

        while(!command.equals("STOP")) {

            int pieces = Integer.parseInt(command);
            area -= pieces;
            if (area < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(area));
                isGone = true;
                break;
            }
            command = scan.nextLine();


        }
        if (!isGone){
            System.out.printf("%d pieces are left.", area);
        }

    }
}
