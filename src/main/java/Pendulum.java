import java.util.Arrays;

public class Pendulum {
    public static int[] pendulum(final int[] values) {
        int middleIndex = findMiddleIndex(values);
        int[] ints = assignToProperIndex(values, middleIndex);
        return ints;
    }


    public static int[] assignToProperIndex(int[] values, int middleIndex) {
        Arrays.sort(values);
        int[] target = new int[values.length];
        target[middleIndex] = values[0];
        int indexLeft = middleIndex - 1;
        int indexRight = middleIndex + 1;

        for (int i = 1; i < values.length; i++) {
            if (i % 2 != 0) {
                target[indexRight] = values[i];
                indexRight++;
            } else {
                target[indexLeft] = values[i];
                indexLeft--;
            }
        }
        return target;
    }

    public static int findMiddleIndex(int[] values) {
        if ((values.length - 1) / 2 == 0) {
            return values.length / 2 - 1;
        }
        return (values.length - 1) / 2;
    }

    public int[] bubbleSort(int[] values) {
        int temp = 0;

        for (int index = 0; index < values.length - 1; index++) {
            if (values[index] > values[index + 1]) {
                temp = values[index];
                values[index] = values[index + 1];
                values[index + 1] = temp;
            }

        }
        return values;
    }
}
