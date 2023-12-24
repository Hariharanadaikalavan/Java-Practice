public class SpyNumber_3 {    //Sum of digits = Product of digits                //input =123---> 1+2+3=1*2*3 --->6==6
    public static void main(String args[]){
        int Original=123;
        int Number=Original,Sum=0,Product=1;
        while(Number!=0)
        {
                 int remainder=Number%10;
                 Sum=Sum+remainder;
                 Product=Product*remainder;
                 Number=Number/10;
        }
        System.out.println(Sum+"-"+Product);
        
        boolean Result=(Sum==Product);
        
        System.out.println(Result);
    }
}
