
import java.util.Scanner;

public class Loops {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n >= 2 && n <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + i * n);
            }
        } else {
            System.out.println("n must be between 2 and 20");
        }
        scanner.close();
    }

//    public int forLoop() {
//        int     c = 0;
//        for (int c = 0; c < 5; c++) {
//            System.out.println(c);
//        return c;
//        }
//        System.out.println(c);
//        return 0;
//    }

}
