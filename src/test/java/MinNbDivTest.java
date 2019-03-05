import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinNbDivTest {

    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals(1, MinNbDiv.findMinNum(1));
        assertEquals(64, MinNbDiv.findMinNum(7));
        assertEquals(24, MinNbDiv.findMinNum(8));
        assertEquals(36, MinNbDiv.findMinNum(9));
        assertEquals(12, MinNbDiv.findMinNum(6));
    }
}
