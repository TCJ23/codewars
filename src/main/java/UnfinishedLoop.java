import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnfinishedLoop {
    public static List CreateList(int number) {
        return IntStream.rangeClosed(1, number).boxed().collect(Collectors.toList());
    }
}
