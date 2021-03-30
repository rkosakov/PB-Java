import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 24; i++) {

            for (int j = 0; j <= 59; j++) {
                System.out.printf("%d:%d", i, j);
                System.out.println();
            }
        }
    }

}
