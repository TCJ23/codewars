import java.util.Arrays;

public class Swappairs {
    public Object[][][] swapp(Object[][] input) {
        return new Object[][][] {
                input,
                Arrays.stream(input)
                        .map(pair -> new Object[] {pair[1], pair[0]})
                        .toArray(Object[][]::new)
        };
    }
}
/*
    public static Object[][][] swapp(Object[][] inp) {
        // copy a 2D array need to create a new array, and for
        // each element in the 2d array, use .clone() to copy
        Object[][] outp = new Object[inp.length][];
        for (int i = 0; i < inp.length; i++) {
            outp[i] = inp[i].clone();
        }

        for (Object[] oe : outp) {
            Object tmp = oe[0];
            oe[0] = oe[1];
            oe[1] = tmp;
        }


        return new Object[][][]{inp, outp};
    }
*/

    /*
    better solution:
      public Object[][][] swapp(Object[][] inp) {
    final Object[][] outp = new Object[inp.length][2];
    for (int i = 0; i < inp.length; i++) {
      outp[i][0] = inp[i][1];
      outp[i][1] = inp[i][0];
    }
    return new Object[][][] {inp, outp};
  }
    */
