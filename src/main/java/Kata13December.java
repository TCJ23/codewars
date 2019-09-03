import java.util.ArrayList;
import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        ArrayList<Integer> odds = new ArrayList<>(listOfNumbers);
        odds.removeIf(even -> even % 2 == 0);
        return odds;
    }
}