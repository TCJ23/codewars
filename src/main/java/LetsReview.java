import java.util.Scanner;

public class LetsReview {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (1 <= t && t <= 10) {
            for (int i = 0; i < t; i++) {
                String s1 = scanner.nextLine();
                char[] myCharArray = s1.toCharArray();
                if (s1.length() <= 10000 && s1.length() >= 2) {
                    for (int j = 0; j < myCharArray.length; j++) {
                        if (j % 2 == 0) {
                            System.out.print(myCharArray[j]);
                        }
                    }
                    System.out.print(" ");

                    for (int j = 0; j < myCharArray.length; j++) {
                        if (j % 2 != 0) {
                            System.out.print(myCharArray[j]);
                        }
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("T must be between 1 and 10");
        }
        scanner.close();
    }
}
