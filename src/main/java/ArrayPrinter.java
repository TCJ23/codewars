import java.lang.reflect.Array;

public class ArrayPrinter {

    public static <T>String printArray(T[] table) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(table[i]);
        }
        return stringBuilder.toString();
        //System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{2, 4, 5, 2};
        String[] array2 = new String[]{"h","o","l","a"};
        Integer[] array3 = new Integer[]{};
        System.out.println(printArray(array));
        System.out.println(printArray(array2));
        System.out.println(printArray(array3));
    }
}
