package codingGame;


public class AsciiParams {
    int singleAsciiCharacterWidth;
    int singleAsciiCharacterHeight;
    String textToPrint;
    String[][] asciiArray;

    public AsciiParams(int singleAsciiCharacterWidth, int singleAsciiCharacterHeight, String textToPrint, String[][] asciiArray) {
        this.singleAsciiCharacterWidth = singleAsciiCharacterWidth;
        this.singleAsciiCharacterHeight = singleAsciiCharacterHeight;
        this.textToPrint = textToPrint;
        this.asciiArray = asciiArray;
    }

    public int getSingleAsciiCharacterWidth() {
        return singleAsciiCharacterWidth;
    }

    public void setSingleAsciiCharacterWidth(int singleAsciiCharacterWidth) {
        this.singleAsciiCharacterWidth = singleAsciiCharacterWidth;
    }

    public int getSingleAsciiCharacterHeight() {
        return singleAsciiCharacterHeight;
    }

    public void setSingleAsciiCharacterHeight(int singleAsciiCharacterHeight) {
        this.singleAsciiCharacterHeight = singleAsciiCharacterHeight;
    }

    public String getTextToPrint() {
        return textToPrint;
    }

    public void setTextToPrint(String textToPrint) {
        this.textToPrint = textToPrint;
    }

    public String[][] getAsciiArray() {
        return asciiArray;
    }

    public void setAsciiArray(String[][] asciiArray) {
        this.asciiArray = asciiArray;
    }
}
