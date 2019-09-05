import java.util.stream.Stream;

public class Squashthebugs {

    public static int findLongest(final String str) {
      return   Stream.of(str.split(" ")).mapToInt(String::length).max().getAsInt();
    }
}



