import java.util.Scanner;
public class Urinaryoprator {
   public static void main(String[]args)
   {
       char ch;
       do
       {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number wheather positive or negative");
       int a=sc.nextInt();
       String res=(a>0)?"negative":"positive";
        System.out.println(res);
         System.out.println("Do you want to continue Y or N");
         ch=sc.next().charAt(0);
       }
       while(ch=='Y' ||ch=='y');
   }
    
}
