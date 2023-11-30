public class RepeatingValue {
    public static void main(String args[]){   
        int count=0;
        int Number=9894470748;
        while(Number!=0)
        {
                   int remainder=Number%10;
                   if(remainder==9)
                   {
                    count++;
                   }
                 Number=Number/10;
        }
        System.out.println("Repeted digits"+RepeatingValue+"-"+count);
        
    }
}
