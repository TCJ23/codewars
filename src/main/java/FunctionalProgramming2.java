import java.util.function.ToDoubleFunction;

public class FunctionalProgramming2 {
    public static ToDoubleFunction<Triangle> f = t -> {
        t.setArea(.5 * t.base * t.height);
        return t.getArea();
    };

//    public static void someMethod() {
//        int foo = 5;
//        Function<String, Integer> f = s -> s.length() + foo;
//        f.apply("somestring"); //Should be 15
//        sendMethod(f);
//    }
//
//    public static void sendMethod(Function<String, Integer> f) {
//        f.apply("otherstring"); //Should return 16
//    }
//
//    public static void main(String[] args) {
//        someMethod();
//        System.out.println(someMethod());
//    }
}
