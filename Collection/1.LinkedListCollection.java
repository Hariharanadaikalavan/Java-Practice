import java.util.LinkedList;

public class LinkedListColl {
    
    public static void main(String args[]){
           
         LinkedList<Long> obj=new LinkedList<Long>();     
         for(long i=10;i>=1;i--){
            if((i&2)==0) {
         obj.add(i);
            }
            
         }
         System.out.println(obj);
         
          System.out.println(obj.pollFirst());
         System.out.println(obj);
              
                   
              
  }
               
}
