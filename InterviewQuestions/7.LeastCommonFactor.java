public class LeastCommonFactor {
    public static void main(String args[]){
        int num1=2,num2=3;
        
        
        int LCM =(num1>num2)?num1:num2;
        System.out.println("Largest Number is:"+LCM);
        
        while(true){
        if((LCM%num1==0)&&(LCM%num2==0))
        {
            System.out.println("LCM="+str);
            break;
            
        }
        str++;
        }
        
        
    }
}
