public class FIXMELetssplitthisjoint {

    public static String[] split(final String joint) {
        return joint.isEmpty() ? new String[0] : joint.split("\\.",-1);
    }
}
