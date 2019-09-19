import java.math.BigDecimal;
        import java.math.RoundingMode;

public class RoundAndRound {
    public static double roundTo2DecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
