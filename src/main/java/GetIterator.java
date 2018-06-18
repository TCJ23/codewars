import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class GetIterator {
    public static Function<Integer, Integer> getIterator(Function<Integer, Integer> func, int times) {
        //zwraca funkcje, przyj Int zwraca
        //Consumer<String> stringConsumer = (String text) -> System.out.println(text);
        //Function<String, String> stringConsumer = (String sub) -> sub.substring(0, 1);
//        Supplier<String> getString = () -> "text";
        return base -> {
            int buff = base;
            for (int i = 0; i < times; i++) {
                buff = func.apply(buff);
            }
            return buff;
        };
    }
}
