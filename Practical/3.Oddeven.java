import java.util.Scanner;
public class Oddeven {
    public static void main(String[]args)
    {
            Scanner sc=new Scanner(System.in);
            String ch;
             do
            {
            System.out.println("Please the enter number weather number is ODD or EVEN");
            
           
    int a=sc.nextInt();
    if((a&1) ==0)
    {
        System.out.println("Enter number is even Number");
    }
    else
    {
        System.out.println("Enter number is odd Number");
    }
    System.out.println("do");
    ch=sc.next();
            }
            while(ch.equals("yes"));
            }
}
