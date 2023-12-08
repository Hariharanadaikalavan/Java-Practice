//Parametrized Constructor
//Non-Parametrized Constructor
//Parametrized Constructor
//Non-Parametrized Constructor
    class A
{
    public A(int i)
    {
        System.out.println(1);
    }
 
    public A()
    {
        this(10);
 
        System.out.println(2);
    }
 
    void A()
    {
        A(10);
 
        System.out.println(3);
    }
 
    void A(int i)
    {
        System.out.println(4);
    }
}
 
public class Constructor 
{
    public static void main(String[] args)
    {
//        new A().A();
        A a=new A();
        a.A();
    }
}

