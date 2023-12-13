public class BiggestLetter {
    public static void main(String args[]){
       
       String str="hariharan";
       char ch[]=str.toCharArray();
       char large=ch[0];
       for(int i=0;i<ch.length;i++)
       {
          if(ch[i]<large)
          {
              large=ch[i];
          }
       }
       System.out.println(large);
       
    
       
    }
       
 }
