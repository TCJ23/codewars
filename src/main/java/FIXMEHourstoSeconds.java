import java.util.concurrent.TimeUnit;

public class FIXMEHourstoSeconds {
    public static long hoursToSeconds(final int hours) {
        return TimeUnit.HOURS.toSeconds(hours);
    }
}
