import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.ArrayList;
import java.util.Arrays;

public class CircleOfPeopleTest {
    @Test
    public void test5Persons() {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"Bob", "Lorna", "Desiree", "Melissa", "Josh"}));

        assertEquals(CircleOfPeople.crossingOut(list),
                Arrays.asList(new String[]{"Lorna", "Melissa", "Bob", "Josh"}));
    }
}