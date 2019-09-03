import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class UnfinishedLoopTest {

    UnfinishedLoop uf = new UnfinishedLoop();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), uf.CreateList(1));
        assertEquals(Arrays.asList(1, 2), uf.CreateList(2));
        assertEquals(Arrays.asList(1, 2, 3), uf.CreateList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), uf.CreateList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), uf.CreateList(5));
    }
}