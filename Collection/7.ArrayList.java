import java.util.*;  
class ArrayListEx{  
public static void main(String args[]){  
ArrayList list=new ArrayList(); 
list.add("Ravi");  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
list.add(23);
list.add(true);
list.set(2, "hari");
System.out.println(list);
System.out.print(list.get(2));
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

