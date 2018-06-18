import java.util.List;

public class Kata1 {

    public static String stringify(Node node) {
        if (node == null){
            return ("null");
        }
        String result = "";
        result = result + node.getData() + " -> ";
        Node temp = node;
        while (temp.getNext() != null) {
//            result = result + node.getData() + " -> " + node.getNext().getData() + " -> " + node.getNext().getNext().getData();
        temp = temp.getNext();
        result = result + temp.getData() + " -> ";
        }
        result = result +"null";
        return result;

    }
}