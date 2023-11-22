import java.util.Scanner;
public class Asciivalue {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value which STARTING of ASCII Value");
      int a=sc.nextInt();
        System.out.println("enter the value which ENDING of ASCII Value");
      int b=sc.nextInt();
              
      for(int i=a;i<=b;i++)
      {
          System.out.println((char)i+"is"+i);
      }
    }
}
