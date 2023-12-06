class SuperClasss
{
//    void superClassMethod(Number n)
    void superClassMethod(Integer n)
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClasss
{
    void superClassMethod(Double d)
    {
        System.out.println("From Sub Class");
    }
}
 
public class SuperClass
{
    public static void main(String[] args)
    {
        SubClass sub = new SubClass();
 
        sub.superClassMethod(123321);
    }
}
