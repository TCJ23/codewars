import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest1 {
    @Test
    public void sampleTests() {
        assertEquals("1 -> 2 -> 3 -> null", Kata1.stringify(new Node(1, new Node(2, new Node(3)))));
        assertEquals("0 -> 1 -> 4 -> 9 -> 16 -> null", Kata1.stringify(new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))));
        assertEquals("null", Kata1.stringify(null));
    }
}