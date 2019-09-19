package codingGame;

class AsciiDrawer {

    private Input input;


    AsciiDrawer(Input input) {
        this.input = input;
    }

    String draw() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String asciiRepresentationRow : input.getAsciiRepresentationRows()) {
            stringBuilder.append(AsciiLettersHandler.drawRow(asciiRepresentationRow, input.getTextToDraw().toCharArray(), input.getLength()));
            stringBuilder.append("\n");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

}

class AsciiLettersHandler {

    private static final int NUMBER_OF_ALPHABET_LETTERS = ('Z' - 'A' + 1);
    private static final int NUMBER_LETTERS_BETWEEN_LOWER_UPPER_A = ('a' - 'A');

    static int getStartingIndex(Character letter, int length) {
        if('A' <= letter && letter<='Z'){
            return (letter - 'A') * length;
        }else if('a' <= letter && letter<='z'){
            return (letter - NUMBER_LETTERS_BETWEEN_LOWER_UPPER_A - 'A') * length;
        }
        else
            return NUMBER_OF_ALPHABET_LETTERS * length;

    }

    static int getEndingIndex(Character letter, int length) {
        return getStartingIndex(letter,length)+length;
    }

    static String drawRow(String asciiRepresentationRow, char[] chars, Integer length) {
        StringBuilder stringBuilder = new StringBuilder();
        for(Character letter : chars){
            int startingIndex = getStartingIndex(letter, length);
            int endingIndex = getEndingIndex(letter, length);
            stringBuilder.append(asciiRepresentationRow, startingIndex, endingIndex);
        }
        return stringBuilder.toString();
    }
}