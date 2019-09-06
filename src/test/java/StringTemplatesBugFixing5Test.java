import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringTemplatesBugFixing5Test {
    @Test
    public void fixedTests() {
        assertEquals(StringTemplatesBugFixing5.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!");
        assertEquals(StringTemplatesBugFixing5.buildString("Cheese","Milk"),"I like Cheese, Milk!");
        assertEquals(StringTemplatesBugFixing5.buildString("Chocolate"),"I like Chocolate!");
    }
}