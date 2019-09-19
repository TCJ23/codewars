package codingGame;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AsciiLettersHandlerTest {
    @Test
    public void returnStartingPositionForALength4() {
        Assertions.assertThat(AsciiLettersHandler.getStartingIndex('A',4)).isEqualTo(0);
    }

    @Test
    public void returnStartingPositionForBLength4() {
        Assertions.assertThat(AsciiLettersHandler.getStartingIndex('B',4)).isEqualTo(4);
    }

    @Test
    public void returnStartingPositionForELength4() {
        Assertions.assertThat(AsciiLettersHandler.getStartingIndex('E',4)).isEqualTo(16);
    }

    @Test
    public void returnEndingPositionForALength4() {
        Assertions.assertThat(AsciiLettersHandler.getEndingIndex('A',4)).isEqualTo(4);
    }

    @Test
    public void returnEndingPositionForBLength4() {
        Assertions.assertThat(AsciiLettersHandler.getEndingIndex('B',4)).isEqualTo(8);
    }

    @Test
    public void returnEndingPositionForELength4() {
        Assertions.assertThat(AsciiLettersHandler.getEndingIndex('E',4)).isEqualTo(20);
    }

}
