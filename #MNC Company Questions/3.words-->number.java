import java.util.Scanner;
public class ChartoNum {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter you name to check the equilvent aplhabetic order");
        String str = sc.next();
        str = str.toLowerCase();
    for(int i = 0;i<str.length();i++){
        System.out.println(str.charAt(i)+"->"+(str.charAt(i) - 96));
}
}
        
        
    }
