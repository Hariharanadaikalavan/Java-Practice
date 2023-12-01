public class Recussion {
    
    public static void num(int a){
    if(a>0){
        num(a-1);
      }
    System.out.println(a);
    }
    
    public static void main(String args[]){
            num(10);
    }
}
