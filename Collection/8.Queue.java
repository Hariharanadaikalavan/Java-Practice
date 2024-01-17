public class QueueList {
       
    public static void main(String args[]){
        
        Queue<Integer> obj=new LinkedList<Integer>();
        obj.add(20);
        obj.add(50);
    
   System.out.print(obj);
   
  System.out.print(obj.peek()) ;
  
  System.out.println(obj.poll());
    System.out.print(obj.peek()) ;
   
           }
}
