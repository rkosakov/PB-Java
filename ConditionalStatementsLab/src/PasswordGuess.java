import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = "s3cr3t!P@ssw0rd";
        String password = scan.nextLine();

        if (pass.equals(password)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
