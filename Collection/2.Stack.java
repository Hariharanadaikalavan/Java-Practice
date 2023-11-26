import java.util.*;
class Stack{
public static void main(String args[]){
Stack<String>stack=new Stack<String>();
stack.push("Hari");
stack.push("Hari");
stack.push("Hari");
stack.push("Hari");
stack.pop();

Iterator<String> itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}

}
