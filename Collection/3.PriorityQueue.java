import java.util.Iterator;
import java.util.PriorityQueue;

class Dummy1{
public static void main(String hari[]){

PriorityQueue<String> queue=new PriorityQueue<String>();
queue.add("Hariharan");
queue.add("Hariharan");
queue.add("Hariharan");
queue.add("Hariharan");
System.out.println("head"+queue.element());
System.out.println("head:"+queue.peek());
Iterator itr=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
queue.remove();
queue.poll();
System.out.println("After Removing two elements");
Iterator<String> itr2=queue.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}

}
}
