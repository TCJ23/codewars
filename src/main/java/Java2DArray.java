import java.util.Scanner;

public class Java2DArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maxVal = Integer.MIN_VALUE;


        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
//                if (i > 3 || j > 3) continue;

                int glassSum =
                        arr[j][i] + arr[j][i + 1] + arr[j][i + 2]
                                + arr[j + 1][i + 1] +
                        arr[j + 2][i] + arr[j + 2][i + 1] + arr[j + 2][i + 2];

                if (glassSum > maxVal) maxVal = glassSum;
            }
        }

        System.out.print(maxVal);
        scanner.close();
    }
            //    INPUT
            /*
            1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 9 2 -4 -4 0
0 0 0 -2 0 0
0 0 -1 -2 -4 0
            1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 9 2 -4 -4 0
            0 0 0 -2 0 0
            0 0 -1 -2 -4 0
            RESULT 13
            */
}