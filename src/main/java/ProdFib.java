public class ProdFib { // must be public for codewars

    static long[] cache = new long[900000];

    public static long[] productFib(long prod) {
        int i = 0;
        long result = (calculateFib(i) * calculateFib(i + 1));
        while (result < prod) {
            i++;
            result = (calculateFib(i) * calculateFib(i + 1));
        }
        if (result == prod) {
            return new long[]{calculateFib(i), calculateFib(i + 1), 1};
        } else
            return new long[]{calculateFib(i), calculateFib(i + 1), 0};
    }


    private static boolean inCache(int x) {
        return cache[x] != 0;
    }

    private static long calculateFib(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else if (x > 1) {
            if (inCache(x)) {
                return cache[x];
            } else{
                cache[x] = calculateFib(x - 1) + calculateFib(x - 2);
                return cache[x];
            }
        }
        throw new RuntimeException();
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(calculateFib(i));
//        }
//    }

        //    private static long calculateFib(long x) {
//        if (x == 0) {
//            return x;
//        } else if (x == 1) {
//            return x;
//        } else if (x > 1) {
//            return calculateFib(x - 1) + calculateFib(x - 2);
//        }
//        throw new ArithmeticException();
//    }
    }
}

