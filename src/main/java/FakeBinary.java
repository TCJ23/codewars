import static java.util.stream.Collectors.joining;

public class FakeBinary {
    public static String fakeBin(String numberString) {
//        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
        return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());

    }
}
