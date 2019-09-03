import java.util.Arrays;

public class Flatten2DArray {
    public static int[] flattenAndSort(int[][] array) {
       return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
