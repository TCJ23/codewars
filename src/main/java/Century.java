import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Century {

    public static int century(int number) throws ParseException {
        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(String.valueOf(number));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int century = (calendar.get(Calendar.YEAR) / 100) + 1;

        return century;
    }
}
