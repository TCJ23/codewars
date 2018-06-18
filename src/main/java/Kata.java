import java.util.Arrays;

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if(input == null || input.length ==0 ) {
            return new int[]{};
        }
        for (int i = 0; i < input.length; i++) {
            if(input[i] > 0){
                count++;
            }
            else if (input[i] < 0){
                sum += input[i];
            }
        }
        return new int[]{count,sum};
    }
    public static void main(String[] args) {
        countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15} );
    }
}

