package codingGame;

import java.util.Scanner;

public class ASCii {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        AsciiParams asciiParams = readParametersFromInput(in);
        validateParams(asciiParams);
        String[][] strings = create2dAsciiArrayFromText(asciiParams);
        printOutAsciiCharacters(strings);
    }


    public static String[][] create2dAsciiArrayFromText(AsciiParams asciiParams) {
        int letterWidth = asciiParams.getSingleAsciiCharacterWidth();
        int letterHeight = asciiParams.getSingleAsciiCharacterHeight();


        String[][] asciiResult = new String[letterHeight][letterWidth];
        String[][] patternTemplate = asciiParams.getAsciiArray();
        String textToPrint = asciiParams.getTextToPrint().toUpperCase();

        for (char singleLetter : textToPrint.toCharArray()) {
            int index = (int) singleLetter - 65;
            int evaluatedIndex = checkIndex(index);

            for (int row = 0; row < letterHeight; row++) {

                for (int ascii = 0; ascii < letterWidth; ascii++) {
                    int shift = evaluatedIndex * letterWidth + ascii;
                    asciiResult[row][ascii] = patternTemplate[row][shift];
                }
            }
        }
        return asciiResult;
    }

    private static int checkIndex(int index) {
        if (index < 0 || index > 25) {
            index = 26;
        }
        return index;
    }


    private static void validateParams(AsciiParams asciiParams) {
        int height = asciiParams.getSingleAsciiCharacterHeight();
        int width = asciiParams.getSingleAsciiCharacterWidth();
        int numberOfAsciiCharacters = asciiParams.getTextToPrint().toCharArray().length;

        if (height < 0 || width < 0 || numberOfAsciiCharacters <= 0 ||
                height > 30 || width > 30 || numberOfAsciiCharacters > 200 ||
                (numberOfAsciiCharacters / width) != 0) {
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

    private static void printOutAsciiCharacters(String[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                System.out.print(data[row][column]);
            }
            System.out.println();
        }
    }
}
