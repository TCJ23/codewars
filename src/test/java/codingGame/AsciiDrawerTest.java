package codingGame;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AsciiDrawerTest {


    private String asciiParams;
    private String asciiArt;

    @Before
    public void setUp() {

        asciiParams = "" +
                "4\n" +
                "5 \n";

        asciiArt = "" +
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### \n" +
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # \n" +
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## \n" +
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       \n" +
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";
    }


    @Test
    public void TestOnlyOneLetter_E() {

        String textToTransform = "E\n";
        String inputString = asciiParams + textToTransform + asciiArt;
        Input input = new Input(inputString);

        AsciiDrawer asciiDrawer = new AsciiDrawer(input);
        assertThat(asciiDrawer.draw())
                .isEqualTo("" +
                        "### \n" +
                        "#   \n" +
                        "##  \n" +
                        "#   \n" +
                        "### ");
    }

    @Test
    public void TestOnlyOneLetter_A() {

        String textToTransform = "A\n";
        String inputString = asciiParams + textToTransform + asciiArt;
        Input input = new Input(inputString);

        AsciiDrawer asciiDrawer = new AsciiDrawer(input);
        assertThat(asciiDrawer.draw())
                .isEqualTo("" +
                        " #  \n" +
                        "# # \n" +
                        "### \n" +
                        "# # \n" +
                        "# # ");
    }

    @Test
    public void TestOnlyOneLetter_InterrogationPoint() {

        String textToTransform = "?\n";
        String inputString = asciiParams + textToTransform + asciiArt;
        Input input = new Input(inputString);

        AsciiDrawer asciiDrawer = new AsciiDrawer(input);
        assertThat(asciiDrawer.draw())
                .isEqualTo("" +
                        "### \n" +
                        "  # \n" +
                        " ## \n" +
                        "    \n" +
                        " #  ");
    }

    @Test
    public void TestTwoLetter_AB() {

        String textToTransform = "AB\n";
        String inputString = asciiParams + textToTransform + asciiArt;
        Input input = new Input(inputString);

        AsciiDrawer asciiDrawer = new AsciiDrawer(input);
        assertThat(asciiDrawer.draw())
                .isEqualTo("" +
                        " #  ##  \n" +
                        "# # # # \n" +
                        "### ##  \n" +
                        "# # # # \n" +
                        "# # ##  ");
    }

    @Test
    public void TestLowerCase_a() {

        String textToTransform = "a\n";
        String inputString = asciiParams + textToTransform + asciiArt;
        Input input = new Input(inputString);

        AsciiDrawer asciiDrawer = new AsciiDrawer(input);
        assertThat(asciiDrawer.draw())
                .isEqualTo("" +
                        " #  \n" +
                        "# # \n" +
                        "### \n" +
                        "# # \n" +
                        "# # ");
    }

}