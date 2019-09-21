package codingGame;

import org.junit.Test;

public class AsciiArtTest {

    private static final String ALPHABET =
            " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### \n" +
            "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # \n" +
            "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## \n" +
            "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       \n" +
            "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";

    @Test
    public void test() {
        AsciiArtGenerator generator = new AsciiArtGenerator( ALPHABET, 5, 4 );
        System.out.println( generator.generate( "Lorem ipsum ,," ) );
    }

    class AsciiArtGenerator {

        private final String alphabet;
        private final int letterHeight;
        private final int letterWidth;
        private final int numberOfChars;

        public AsciiArtGenerator( String alphabet, int letterHeight, int letterWidth ) {
            int lineLenght = alphabet.indexOf( '\n' );
            this.numberOfChars = lineLenght / letterWidth;
            this.alphabet = alphabet.replaceAll( "\n", "" );
            this.letterHeight = letterHeight;
            this.letterWidth = letterWidth;
        }

        public String generate( String text ) {
            StringBuilder output = new StringBuilder();

            char[] chars = text.toUpperCase().toCharArray();
            for ( int currentHeight = 0; currentHeight < letterHeight; currentHeight++ ) {
                for ( char c : chars ) {
                    // normalize index to 0-based
                    int asciiPosition = (int) c - 65;
                    // make sure we don't use anything lower than A
                    asciiPosition = asciiPosition < 0 ? numberOfChars : asciiPosition;
                    int charPosition = Math.min( asciiPosition, numberOfChars - 1 );

                    int rowIndex = ( currentHeight * numberOfChars * letterWidth );
                    int offset = rowIndex + ( (charPosition) * letterWidth );

                    output.append( alphabet, offset, offset + letterWidth);
                }
                output.append( '\n' );
            }

            return output.toString();
        }
    }
}
