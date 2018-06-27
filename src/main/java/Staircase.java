public class Staircase {

    public static void main(String[] args) {
        int height = 8;
        // will need 3 loops for left pyramid
        // first is loop for rows, 1st index is 0, height is 8
        for (int row = 0; row < height; row++) {
            // second loop for spaces, 8th row has 1#,7spaces
            for (int space = height - row; space > 1; space--) {
                System.out.print(" ");
            }
            // third loop for hashes, 3rd row has 3#, 5spaces
            for (int hash = 0; hash < row + 1; hash++) {
                System.out.print("#");
            }
            System.out.print(" ");
            // one loop for right pyramid 1st row 1#
            for (int hash = 0; hash < row + 1; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
