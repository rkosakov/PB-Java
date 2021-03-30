import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0;

        if (n2 == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", n1);
        }
         if (operator.equals("+")) {
             result = n1 + n2;
         } else if (operator.equals("-")) {
             result = n1 - n2;
         } else if (operator.equals("*")) {
             result = n1 * n2;
         } else if (operator.equals("/") && n2 != 0) {
              result =  (n1 * 1.0) / n2;
         } else if (operator.equals("%") && n2 != 0) {
             result = n1 % n2;
         }

         if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
             if (result % 2 == 0) {
                 System.out.printf("%d %s %d = %.0f - even", n1, operator, n2, result);
             } else {
                 System.out.printf("%d %s %d = %.0f - odd", n1, operator, n2, result);
             }
         } else if (n2 != 0 && operator.equals("/")) {
             System.out.printf("%d %s %d = %.2f", n1, operator, n2, (double) result);
         } else if (n2 != 0 && operator.equals("%")){
             System.out.printf("%d %s %d = %.0f", n1, operator, n2, (double) result);
         }

    }
}
