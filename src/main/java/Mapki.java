import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Mapki {

    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> mapCountUnique = new HashMap<>();
        for (int i=0; i < 100000; i++ ){
            int value = rand.nextInt(10 + 1);
            Integer count = mapCountUnique.get(value);
            if (count == null){
                count=0;
            }
            count++;
            mapCountUnique.put(value,count);
        }
        System.out.println(mapCountUnique.toString());
    }
}

