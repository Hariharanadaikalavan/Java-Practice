import java.util.*;

class ArrayList{

public static void main(String args[]){
ArrayList<String> obj=new ArrayList<String>();
obj.add("Hariharan");
obj.add("");
obj.add("Hariharan");
System.out.println(obj);

Iterator itr=obj.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

}
}
