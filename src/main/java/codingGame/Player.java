package codingGame;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Math.abs;


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (n == 0) {
            System.out.println(0);
        }
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            data[i] = t;
        }
   /*     List<Integer> list = Arrays.stream(data).sorted().boxed().collect(Collectors.toList());

        list.stream()
                .min(Comparator.comparingInt(i -> Math.abs(i - 0)))
                .ifPresent(System.out::println);
    }*/

        Arrays.stream(data).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b))
                .ifPresent(System.out::println);
    }
}