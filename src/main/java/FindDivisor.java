public class FindDivisor {

    public static long numberOfDivisors(int n) {
        int divisor = 0;
        if (n == 0) {
            return 0;
        } else
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                divisor++;
        }
        return divisor + 1;
    }


    public static void main(String[] args) {
        System.out.println(numberOfDivisors(12));
    }
}