import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CircleOfPeople {

    public static List<String> crossingOut(List<String> list) {
        List<String> result = new ArrayList<String>();
        int counter = 0;
        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            String person = iter.next();
            counter++;
            if (counter % 2 == 0) {
                iter.remove();
                result.add(person);
            }
            if (iter.hasNext() == false && list.size() > 1) {
                iter = list.iterator();
            }
        }
        return result;
    }
}