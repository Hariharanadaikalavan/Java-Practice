import java.util.Scanner;
public class Dectobin_bintodec {
    public static void main(String[]args)
    {
        char ch;
        do
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to convert decimal to binary");
        int decimal=sc.nextInt();
        String Binary=Integer.toBinaryString(decimal);
        
        System.out.println("Decimal value of"+decimal+"is  "+Binary);
        System.out.println("Do you want to continue Y or N");
         ch=sc.next().charAt(0);
        }
        while(ch== 'y'||ch=='Y');
    }
    
}
