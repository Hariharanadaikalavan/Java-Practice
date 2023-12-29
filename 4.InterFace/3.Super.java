  class A
{
   A() {
        System.out.println(1);
    }
}
 
class B extends A
{
   B() {
        System.out.println(2);
    }
}
 
class C extends B
{
    C(){
        System.out.println(3);
    }
}
 
public class Upcasting
{
    public static void main(String[] args)
    {
        C c = new C();
        
        
    }
}
