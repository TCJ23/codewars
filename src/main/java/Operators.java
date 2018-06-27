import java.util.Scanner;

public class Operators {

    /* Sample Input

           12.00
           20
           8
       Sample Output

       The total meal cost is 15 dollars.    static void solve(double meal_cost, int tip_percent, int tax_percent) {
       */
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;
        double total_cost = meal_cost + tip + tax;
        int total = (int) Math.round(total_cost);
        System.out.println("The total meal cost is " + total + " dollars.");
        ;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
