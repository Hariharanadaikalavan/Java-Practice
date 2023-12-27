public class NeonNumber_6 {                  //input=9------->9*9=81--->8+1=9 sum of digits of square is equal to input number
public static void main(String args[]){
    int Original=9;
    int Power=Original*Original;
    int Number=Power;   //81 Assigned the values for iteration
    
    int Sum=0;
    while(Number!=0)
    {
           int Remainder=Number%10;
           Sum=Sum+Remainder;  //9
           Number=Number/10;
    }
    
    System.out.println(Sum+"-"+Power+"-"+Original);
    
    boolean Result=(Original==Sum);
    System.out.println(Result);
}    
}
