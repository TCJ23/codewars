import java.util.stream.IntStream;

public class MinNbDiv {

    public static int findMinNum(int num) {
        return IntStream.iterate(1, x -> x + 1)
                .filter(x -> divisorCount(x) == num)
                .findFirst().getAsInt();
    }

    private static int divisorCount(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count;
    }
}