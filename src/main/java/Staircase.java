public class Staircase {

    public static void main(String[] args) {
        int height = 6;

        for (int row = 0; row < height; row++) {
            for (int space = height - row; space > 1; space--) {
                System.out.print(" ");
            }
            for (int hash = 0; hash < row + 1; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("Hello World");
        System.out.println("Hello Java");
    }

}
