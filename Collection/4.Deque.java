  
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Deque;

class Dummy1 {
    public static void main(String args[]) {
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.add("Revathi");
        myDeque.add("Revathi");
        myDeque.add("Revathi");

        for (String str : myDeque) {
            System.out.println(str);
        }
    }
}
