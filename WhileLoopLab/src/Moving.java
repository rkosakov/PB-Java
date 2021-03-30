import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int apartmentSize = width * length * height;
        int totalBoxes = 0;

        String command = scan.nextLine();

        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            totalBoxes += boxes;

            if (totalBoxes > apartmentSize) {
                System.out.printf("No more free space! You need %d Cubic meters more.", totalBoxes - apartmentSize);
                return;
            }
            command = scan.nextLine();
        }

        System.out.printf("%d Cubic meters left.", apartmentSize - totalBoxes);

    }
}
