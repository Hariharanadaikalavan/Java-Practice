import java.util.Scanner;
public class Switchcase {
    public static void main(String[]args)
    {
        char ch;
        do
            
        {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the first Element");
        a=sc.nextDouble();
        System.out.println("Enter the second Element");
        b=sc.nextDouble();
        System.out.println("Use any one of the oprator+,-,*,%");
         ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':
                   c=a+b;
                    System.out.println("Addition of two numbers"+a+"+"+b+"="+c);
                    break;
              
            case '-':
                c=a-b;
                System.out.println(a+"-"+b+"="+c);
                break;
            
            case '*':
                c=a*b;
                System.out.println(a+"*"+b+"="+c);
                break;
            
            case '%':
                c=a%b;
                 System.out.println(a+"%"+b+"="+c);
                break;
                
                case '/':
                c=a/b;
                 System.out.println(a+"/"+b+"="+c);
                break;
            default:
                System.out.println("Input Mis-Match");
                break;
        }
        
         System.out.println("Do you want to Continue");
         ch=sc.next().charAt(0);
        }
         while(ch=='y'||'y');
            
        
        
        
    }
}
