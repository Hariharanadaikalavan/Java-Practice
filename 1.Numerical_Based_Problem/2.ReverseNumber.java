public class ReverseNumber_2 {
    public static void main(String Hari[]){
    
        int Original=123456;
        int number=Original;
        int reverse=0;
        while(number!=0)
        {
                  int remainder=number%10;
                  reverse=reverse*10+remainder;
                  number=number/10;
        }
        System.out.println("ReverseNumber = "+reverse);
        System.out.println("Original Number ="+Original);
        
        String result=(reverse==Original)?"Palindrome":"Not Palindrome";
        
        System.out.println(result);
    }
}
