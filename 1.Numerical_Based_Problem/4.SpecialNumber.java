public class SpecialNumber_4 {                     //input value=59---->5+9+5*9 =59    Sum of digits +Product of digits =InputValue
    public static void main(String args[]){
        int Original=59;
        int Number=Original;
        int Sum=0,Product=1;
        while(Number!=0)
         {
                   int Remainder=Number%10;
                   Sum=Sum+Remainder;  Product=Product*Remainder;
                   Number=Number/10;
        }
        System.out.println(Sum+"-"+Product);
        int SumOf=Sum+Product;                      //input value=59---->5+9+5*9 =59 
        System.out.println(SumOf);
        
        boolean Result=(SumOf==Original);
        System.out.println(Result);
    }
}
