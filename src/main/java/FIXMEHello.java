import java.util.LinkedHashMap;
import java.util.Map;

public class FIXMEHello {
    private final Map<String, String> attributes = new LinkedHashMap<>();

    public FIXMEHello() {
        attributes.put("", "Hello.");
    }

    public FIXMEHello setAge(int age) {
        attributes.put("age", String.format("I am %d.", age));
        return this;
    }

    public FIXMEHello setSex(char sex) {
        attributes.put("sex", String.format("I am %s.", sex == 'M' ? "male" : "female"));
        return this;
    }

    public FIXMEHello setName(String name) {
        attributes.put("name", String.format("My name is %s.", name));
        return this;
    }

    public String hello() {
        return String.join(" ", attributes.values());
    }
}

/*
import java.util.*;
        import java.util.stream.*;
class Dinglemouse extends LinkedHashMap<Integer,String>
{
    public Dinglemouse setAge(int Q){put(0," I am " + Q + '.');return this;}
    public Dinglemouse setSex(char Q){put(1," I am " + (Q < 77 ? "female" : "male") + '.');return this;}
    public Dinglemouse setName(String Q){put(2," My name is " + Q + '.');return this;}
    public String hello(){return "Hello." + values().stream().collect(Collectors.joining(""));}
}*/
