public class Small {
    public static void main(String args[]){
       
       String str="hariharan";
       char ch[]=str.toCharArray();
       char Small=ch[0]; //Assume the first character as small
       for(int i=0;i<ch.length;i++){
          if(Small>ch[i]){
              Small=ch[i];
          }
     }
       System.out.println(Small);
       
    
       
    }
       
 }
