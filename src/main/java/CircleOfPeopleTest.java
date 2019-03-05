import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleOfPeopleTest {
    @Test
    public void test5Persons() {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(new String[]{"Bob", "Lorna", "Desiree", "Melissa", "Josh"}));

        assertEquals(CircleOfPeople.crossingOut(list),
                Arrays.asList(new String[]{"Lorna", "Melissa", "Bob", "Josh"}));
    }
}