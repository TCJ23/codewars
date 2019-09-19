package codingGame;

import java.util.Scanner;

public class ASCii {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        AsciiParams asciiParams = readParametersFromInput(in);
        validateParams(asciiParams);
        String[][] strings = doALL();
        printOutAsciiCharacters(strings);

    }

    private static void validateParams(AsciiParams asciiParams) {
        int height = asciiParams.getSingleAsciiCharacterHeight();
        int width = asciiParams.getSingleAsciiCharacterWidth();
        int numberOfAsciiCharacters = asciiParams.getTextToPrint().toCharArray().length;

        if (height < 0 || width < 0 || numberOfAsciiCharacters <= 0 ||
                height > 30 || width > 30 || numberOfAsciiCharacters > 200) {
            throw new IllegalArgumentException();
        }
    }

    private static AsciiParams readParametersFromInput(Scanner in) {
        int width = in.nextInt();
        int height = in.nextInt();

        if (in.hasNextLine()) {
            in.nextLine();
        }
        String textToPrint = in.nextLine();
        String[][] array = new String[height][width * 27];
        for (int i = 0; i < height; i++) {
            array[i] = in.nextLine().split("");
        }

        return new AsciiParams(width, height, textToPrint, array);
    }

    public static String[][] doALL() {
        return new String[0][0];
    }

    private static void printOutAsciiCharacters(String[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                System.out.print(data[row][column]);
            }
            System.out.println();
        }
    }
}
