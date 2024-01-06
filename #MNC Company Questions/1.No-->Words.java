import java.util.Scanner;
public class NumbersToStrings {  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter you name :");
        String str=sc.next();
        System.err.println("Thanks for choosing program Mr/Ms:"+str);
        System.out.println("Please enter any the Number Respectively To Convert the numbers into digits using array Concepts");
        int Number=sc.nextInt();
        
        
        if(Number<0 || Number>999){
            System.err.println("Please Enter the 3 Digit Number respectively");
        }else{
            int unitPlace=Number%10;
            int Remaining=Number/10;
            int TenPlace=Remaining%10;
            int HundredPlace=Number/100;
            String singleDigits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","eleven","Twelve","thirteen","fourteen","fiteen","sixteen","seventeen","eighteen","nineteen","Twenty"};
            String twoDigits[]={"and","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String Hundred="Hundred";
         if(Number<20){
             System.out.println(singleDigits[Number]);
           }else if(Number>=20 && Number<=100){
               System.out.println(twoDigits[TenPlace]+" "+singleDigits[unitPlace]);
           }else{
               System.err.println(singleDigits[HundredPlace]+" "+Hundred+" "+twoDigits[TenPlace]+" "+singleDigits[unitPlace]);
               
           }
            
        }
       
    }
}
