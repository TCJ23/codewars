import java.util.Arrays;
import java.util.stream.Stream;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
//        int result[] = new int[arr1.length];
//        Arrays.setAll(result, i -> arr1[i] + arr2[i]);
//        return Arrays.stream(result).sum();
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();

    }
}
