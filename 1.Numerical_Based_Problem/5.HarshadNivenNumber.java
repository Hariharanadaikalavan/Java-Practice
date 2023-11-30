public class HarshadNumberOrNivenNumber {                      //input value=156---->1+5+6=12,which is divible by 156(input value)
    public static void main(String hari[]){
        int Original=156;
        int Number=Original;
        int Sum=0;
        
        while(Number!=0){
                 int Remainder=Number%10;
                 Sum=Sum+Remainder;
                 Number=Number/10;
        }
        
        System.out.println(Original+"%"+Sum);           
        
        String Result=(Original%Sum==0)?"HarshNumber The number is Excatly Divisble":"Not a HarshNumber";   //1+5+6=12 which is excatly divisible by OriginalNumber
        System.out.println(Result);
    }
}
