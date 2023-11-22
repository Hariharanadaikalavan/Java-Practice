import java.util.Scanner;
public class Swapping {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
     System.out.println("Enter the First value");
     int a=sc.nextInt();
     System.out.println("Enter the second value");
    int b=sc.nextInt();
     System.out.println("Before Swapping the values of a & b are"+"   a"+"="+a+"  "+" &"+"b"+"="+b);
    
     a=a+b;
     b=a-b;
     a=a-b;
      System.out.println("Before Swapping the values of a & b are"+"  a"+"="+a+"  "+" &"+"b"+"="+b);
   }
    
}
