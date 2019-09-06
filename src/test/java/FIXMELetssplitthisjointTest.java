import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FIXMELetssplitthisjointTest {

    private static String[] show(final String[] ary) {
        System.out.println(Arrays.toString(ary));
        return ary;
    }

    @Test
    public void example() {
        assertEquals(new String[]{"a","b","c"}, show(FIXMELetssplitthisjoint.split("a.b.c")));
    }

}