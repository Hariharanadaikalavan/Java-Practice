public class RepeatingValue {
    public static void main(String args[]){   
        int counter=0;
        int Number=9894470;
        while(Number!=0)
        {
                   int remainder=Number%10;
                   if(remainder==9)
                   {
                    counter++; //Condition satisfied increased by one
                   }
                 Number=Number/10;
        }
        System.out.println("Repeted digits"+"-"+count);
        
    }
}
