public class KrishnamurthyNumber_8 {
    public static void main(String args[]){
        int Original=145;
        int Number=Original;
        int sum=0;
        
        while(Number!=0)
        {
                   int Remainder=Number%10;
                             int fact=1;
                             for(int i=1;i<=Remainder;i++){
                             fact=fact*i;
                              }
                              sum=sum+fact;
                    Number=Number/10;
        }
    
   
    System.out.println(sum +"-"+Original);
     String Result=(Original==sum)?" KrishnaMurthy Number":"Not a Krishnamurthy Number";
     System.out.println(Result);
    }
}
