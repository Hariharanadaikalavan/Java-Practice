 class ClassOne
{
    void method(String s1)
    {
        method(s1, s1 + s1);  //java1 ,java1 
    }
 
    void method(String s1, String s2)
    {
        method(s1, s2, s1+s2);//java1 ,java1 ,java1java1
    }
 
    void method(String s1, String s2, String s3)
    {
        System.out.println(s1+s2+s3);//java1java1java1java1
    }
}
 
public class StringEX 
{
    public static void main(String[] args)
    {
        ClassOne one = new ClassOne();
 
        one.method("JaVa1");
       
    }
}

