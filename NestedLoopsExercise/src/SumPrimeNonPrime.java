import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int sumPrime = 0;
        int sumNonPrime = 0;

        while(true) {
            String  input = scan.nextLine();
            if(input.equals("stop")){
                break;
            }
            int n = Integer.parseInt(input);
            if (n < 0) {
                System.out.println("Number is negative.");
                continue;
            }
            int primeCounter = 0;
            for (int i = 1; i <= n; i++) {


                if (n % i == 0) {
                    primeCounter++;
                }

            }
            if (primeCounter <= 2) {
                sumPrime += n;
            } else {
                sumNonPrime += n;
            }

        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
