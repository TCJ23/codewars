import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FIXMEHelloTest {

    @Test
    public void testBob27Male() {
        FIXMEHello dm = new FIXMEHello().setName("Bob").setAge(27).setSex('M');
        String expected = "Hello. My name is Bob. I am 27. I am male.";
        assertEquals(expected, dm.hello());
    }

    @Test
    public void test27MaleBob() {
        FIXMEHello dm = new FIXMEHello().setAge(27).setSex('M').setName("Bob");
        String expected = "Hello. I am 27. I am male. My name is Bob.";
        assertEquals(expected, dm.hello());
    }

    @Test
    public void testAliceFemale() {
        FIXMEHello dm = new FIXMEHello().setName("Alice").setSex('F');
        String expected = "Hello. My name is Alice. I am female.";
        assertEquals(expected, dm.hello());
    }

    @Test
    public void testBatman() {
        FIXMEHello dm = new FIXMEHello().setName("Batman");
        String expected = "Hello. My name is Batman.";
        assertEquals(expected, dm.hello());
    }

}