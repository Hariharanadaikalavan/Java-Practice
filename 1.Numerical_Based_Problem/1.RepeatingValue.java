import java.util.Scanner;
public class RepeatingValue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number want to find Occurrence of digits");
     
        int num1=sc.nextInt(),count=0;
           System.out.println("Reapted digits");
      int RepeatingValue=sc.nextInt();
        while(num1!=0)
        {
           int remainder=num1%10;
            if(remainder==RepeatingValue){
            count++;
            }
            num1=num1/10;
        }
        System.out.println("Repeted digits"+RepeatingValue+"-"+count);
        
    }
}
