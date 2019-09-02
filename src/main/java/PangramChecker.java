import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramChecker {
    public boolean check(String sentence) {
        if (sentence == null) {
            return false;
        }
        String strUpper = sentence.toUpperCase();

        Stream<Character> filteredCharStream = strUpper.chars()
                .filter(item -> ((item >= 'A' && item <= 'Z')))
                .mapToObj(c -> (char) c);

        Map<Character, Boolean> alphabetMap =
                filteredCharStream.collect(Collectors.toMap(item -> item, k -> Boolean.TRUE, (p1, p2) -> p1));

        return alphabetMap.size() == 26;
    }
}