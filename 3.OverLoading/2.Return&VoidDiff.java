public class Return{
     
    int method(String a){
        return 5;
    } 
    
    void method(int a){
        System.out.println("Second");
    }
    
    public static void main(String args[]){
        Return a=new Return(); //Creating objects for accessing the values 
       int result =  a.method("hari");
       System.out.println("Result : " + result);
        a.method(23);
    }
}
