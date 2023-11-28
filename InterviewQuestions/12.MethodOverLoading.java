public class MethodOverLoading {
    
    public void print(int i)
    {
        System.out.println("int");
    }
    
    public void print(Integer i){
        System.out.println("Wrapper class");
    }
    
    public void println(long i){
        System.out.println("Long");
    }
    public static void main(String args[]){
        MethodOverLoading obj=new MethodOverLoading();
        
        obj.print(100000000);
    }
}
