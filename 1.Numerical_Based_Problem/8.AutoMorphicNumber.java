public class AutoMorphicNumber {
    public static void main(String args[]){
       int Original=25;
       int Number=Original;
       int Power=Original*Original;
       int PowerRemainder=Power;
       int Flag=0;//625
       while(Number!=0)
       {
                int Remainder=Number%10;
                         PowerRemainder=Power%10;
                if(Remainder!=PowerRemainder){
                 Flag=1;
        }       
                 Number=Number/10; 
                         Power=Power/10;
       }
               
               System.out.println(PowerRemainder+"-"+Original);
               
               if(Flag==0){
                   System.out.print("AutoMorphicNumber");
               }else{
                   System.out.print("The number did satify the Conditions");
               }
    }
}
