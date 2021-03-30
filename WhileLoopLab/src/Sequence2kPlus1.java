import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int result = 1;
        System.out.println(result);

        while(result <= n) {
            result = 2 * result + 1;
            if (result > n) {
                break;
            }
            System.out.println(result);

        }
    }
}
