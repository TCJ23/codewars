import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class DragonsCurve {
//    public IntFunction<String> mapFunction = i -> i == 'a' ? "aRbFR" : i == 'b' ? "LFaLb" : "" + (char)i;

    public IntFunction<String> mapFunction = codePoint ->
            codePoint == 'a' ? "aRbFR" : codePoint == 'b' ? "LFaLb" : Character.toString((char) codePoint);


    //Make the function; map the chars to Strings
    //a -> aRbFR, b -> LFaLb, otherwise -> itself
    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
     * Then remove the a and b (createFilter function is useful for that)
     */
    public String createCurve(int n) {
        String strt="Fa";
        while (n>0){
            strt=strt.chars().mapToObj(value->mapFunction.apply(value)).collect(Collectors.joining(""));
            n--;
        }

        //That's an IntStream with 'F' and 'a' ready to be acted upon
        strt=strt.chars().filter(createFilter('a', false)).peek(i->System.out.print("\n 1 "+i+" "))
                .filter(createFilter('b', false)).peek(i->System.out.print("\n 2 "+i+" "))
                .mapToObj(i->""+(char)i).collect(Collectors.joining("")).toString();
        return strt;
    }

    /**
     * How many of the specified char are in the given curve?
     * Hint: createFilter could be useful for this
     */
    public long howMany(char c, String curve) {
        return curve.chars().filter(createFilter(c, true)).count();
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on keep variable
     */
    public IntPredicate createFilter(char filterWhat, boolean keep) {
        return c -> keep ? c == filterWhat : c != filterWhat;
    }
}