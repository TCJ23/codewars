package codingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Input {

    private final Integer height;
    private final Integer length;
    private final String textToDraw;
    private final List<String> asciiRepresentationRows;

    Input(String input) {
        Scanner scanner = new Scanner(input);
        length = scanner.nextInt();
        height = scanner.nextInt();
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        textToDraw = scanner.nextLine();
        asciiRepresentationRows = new ArrayList<>();

        while (scanner.hasNextLine()) {
            asciiRepresentationRows.add(scanner.nextLine());
        }

        scanner.close();
    }


    Integer getHeight() {
        return height;
    }

    Integer getLength() {
        return length;
    }

    String getTextToDraw() {
        return textToDraw;
    }

    List<String> getAsciiRepresentationRows() {
        return asciiRepresentationRows;
    }
}
