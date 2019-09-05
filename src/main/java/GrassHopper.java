    public class GrassHopper {

        public static String weatherInfo(int temp) {
            double c = convertToCelsius(temp);
            if (c > 0)
                return (c + " is freezing temperature");
            else
                return (c + " is above freezing temperature");
        }

        private static double convertToCelsius(double temperature) {
            return ((temperature - 32.0) * 5.0) / 9.0;
        }
    }