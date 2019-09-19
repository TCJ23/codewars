package codingGame;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class InputTest {
    @Test
    public void checkParsing() {
        String inputString = "" +
                "4\n" +
                "5 \n" +
                "E\n" +
                " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### \n" +
                "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # \n" +
                "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## \n" +
                "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       \n" +
                "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";

        Input input = new Input(inputString);

        assertThat(input.getHeight()).isEqualTo(5);
        assertThat(input.getLength()).isEqualTo(4);
        assertThat(input.getTextToDraw()).isEqualTo("E");

        List<String> asciiRepExpected = new ArrayList<>();
        asciiRepExpected.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ");
        asciiRepExpected.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ");
        asciiRepExpected.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ");
        asciiRepExpected.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ");
        asciiRepExpected.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");

        assertThat(input.getAsciiRepresentationRows()).isEqualTo(asciiRepExpected);
    }
}