public class DuckNumber_5 {               //if a number contains 0 its duckNumber
    public static void main(String args[]){
        int Original=256000;
        int Number=Original;
        int count=0;
        while(Number!=0)
        {
                  int remainder=Number%10;
                  if(remainder==0){
                   count++;
                   }
                   Number=Number/10;
        }
        System.out.println("No:of:Zero Present = "+count);
        
                   boolean Result=(count>0);
        System.out.println(Result);
    }
}
