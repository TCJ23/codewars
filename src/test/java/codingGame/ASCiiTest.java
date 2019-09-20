package codingGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ASCiiTest {

    @Test
    void shouldPrintE() {

        String[][] array = createTestData();

        AsciiParams asciiParams = new AsciiParams(4, 5, "E", array);

        String[][] eAscii = createE();
        String[][] extractedAscii = ASCii.create2dAsciiArrayFromLetters(asciiParams);

        assertThat(extractedAscii).isEqualTo(eAscii);
    }

    @Test
    void shouldPrintA() {

        String[][] array = createTestData();

        AsciiParams asciiParams = new AsciiParams(4, 5, "A", array);

        String[][] aAscii = createA();
        String[][] extractedAscii = ASCii.create2dAsciiArrayFromLetters(asciiParams);

        assertThat(extractedAscii).isEqualTo(aAscii);
    }

    @Test
    void shouldPrintALL() {

        String[][] array = createTestData();

        AsciiParams asciiParams = new AsciiParams(4, 5, "ABCDEFGHIJKLMNOPQRSTUVWXYZ?", array);

        String[][] alphabetAscii = createTestData();
        String[][] extractedAscii = ASCii.create2dAsciiArrayFromLetters(asciiParams);

        ASCii.printOutAsciiCharacters(extractedAscii);
        assertThat(extractedAscii).isEqualTo(alphabetAscii);

    }


    private static String[][] createA() {
        String row0 = " #  ";
        String row1 = "# # ";
        String row2 = "### ";
        String row3 = "# # ";
        String row4 = "# # ";

        String[][] array = new String[5][4];
        array[0] = row0.split("");
        array[1] = row1.split("");
        array[2] = row2.split("");
        array[3] = row3.split("");
        array[4] = row4.split("");
        return array;
    }

    private static String[][] createE() {
         String row0 = "### ";
         String row1 = "#   ";
         String row2 = "##  ";
         String row3 = "#   ";
         String row4 = "### ";

         String[][] array = new String[5][4];
         array[0] = row0.split("");
         array[1] = row1.split("");
         array[2] = row2.split("");
         array[3] = row3.split("");
         array[4] = row4.split("");
         return array;
     }

    private static String[][] createTestData() {
        String row0 = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
        String row1 = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
        String row2 = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
        String row3 = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
        String row4 = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";


        String[][] array = new String[5][4 * 27];
        array[0] = row0.split("");
        array[1] = row1.split("");
        array[2] = row2.split("");
        array[3] = row3.split("");
        array[4] = row4.split("");
        return array;
    }

    public static void main(String[] args) {
        String[][] testData = createTestData();
//        String[][] testData = createE();


        for (int row = 0; row < testData.length; row++) {
            for (int column = 0; column < testData[row].length; column++) {
                System.out.print(testData[row][column]);
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(testData));

    }
}