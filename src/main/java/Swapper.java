import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Swapper{

    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        List<Object> objects = Arrays.asList(args);
        Collections.swap(objects,0,1);
//        Object temp = args[0];
//        args[0] = args[1];
//        args[1] = temp;
//        Collections.swap(args,0,1);
    }
}