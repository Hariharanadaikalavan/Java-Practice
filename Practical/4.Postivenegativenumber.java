import java.util.Scanner;
public class Postivenegativenumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check weather POSITIVE or NEGATIVE");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Number you enter is Postive Integer");
        }
        else if(a<0)
                {
         System.out.println("Number you enter is Negative Interger");
                }
    }    
}
