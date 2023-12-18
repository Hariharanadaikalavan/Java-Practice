public class HigherCommonFactor {
    public static void main(String args[]){
        int num1=12,num2=30;
        
        
        int HCF=(num1<num2)?num1:num2;
        //System.out.println("Largest Number is:"+str);
        
        while(str>2){
        if((num1%str==0)&&(num2%str==0))
        {
            System.out.println("hcf="+str);
            break;
            
        }
        str--;
        }
        
        
    }
}
