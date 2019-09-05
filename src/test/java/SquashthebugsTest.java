import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquashthebugsTest {

    @Test
    public void basicTests() {
        // assertEquals("expected", "actual");
        assertEquals(7, Squashthebugs.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, Squashthebugs.findLongest("Take me to tinseltown with you"));
        assertEquals(7, Squashthebugs.findLongest("Sausage chops"));
        assertEquals(6, Squashthebugs.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, Squashthebugs.findLongest("Lets all go on holiday"));
    }
}