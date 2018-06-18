public class DescendingOrder {
    public static void main(String[] args) {
        String temp = new String();
        int num = 1254859723;
        int[] digits = Integer.toString(num).chars().map(i -> i - 48).sorted().toArray();
        for (int i = digits.length - 1; i >= 0; i--) {
//            System.out.println(i);
            temp += Integer.toString(digits[i]);
            System.out.println(temp);
            Integer.parseInt(temp);
        }
    }
}

//public class DescendingOrder {
//    public static int sortDesc(final int num) {
//        String temp = new String();
////         int num = 1254859723;
//        int[] digits = Integer.toString(num).chars().map(i -> i - 48).sorted().toArray();
//        for (int i = digits.length - 1; i >= 0; i--) {
////            System.out.println(i);
//            temp += Integer.toString(digits[i]);
//        }
//        return Integer.parseInt(temp);
//    }
//}

//        for(int d : digits) {
//            System.out.println(d);
//        }
//    }
//            System.out.println(d);
//        char a = (int)'0';
//            System.out.println((int)a);
//        System.out.println(num);    }



