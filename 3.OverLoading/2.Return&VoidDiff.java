public class ReturnExample{
     
    int method(String a){
        return 5;
    } 
    
    void method(int a){
        System.out.println("Second");
    }
    
    public static void main(String args[]){
        Return a=new Return();
       int result =  a.method("hari");
       System.out.println("Result : " + result);
        a.method(23);
    }
}
