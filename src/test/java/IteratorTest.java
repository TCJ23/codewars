import org.junit.Test;
import java.util.function.*;
import static org.junit.Assert.assertEquals;

public class IteratorTest {
    @Test
    public void testDoubling() throws Exception {
        Function<Integer, Integer> getDouble = x -> x*2;
        Function<Integer, Integer> custDouble = GetIterator.getIterator(getDouble, 1);
        assertEquals("getDouble", (int)4, (int)custDouble.apply(2));
        Function<Integer, Integer> getQuadruple = GetIterator.getIterator(getDouble, 2);
        assertEquals("getQuadruple", (int)8, (int)getQuadruple.apply(2));
    }
}