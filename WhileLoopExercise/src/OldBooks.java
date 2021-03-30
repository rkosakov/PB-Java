import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String favouriteBook = scan.nextLine();

        String book = scan.nextLine();
        int bookCounter = 0;


        while (!book.equals("No More Books")) {
            if (book.equals(favouriteBook)) {
                System.out.printf("You checked %d books and found it.", bookCounter);
                return;
            }
            bookCounter++;
            book = scan.nextLine();

        }

        System.out.printf("The book you search is not here!\nYou checked %d books.", bookCounter);
    }
}
