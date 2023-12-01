public class RandomNumberGenration {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            double a=Math.floor(Math.random()*100);
            System.out.println("The Random Number Genration");
            System.out.println(a);
        System.out.println("Do you want to genrate Number");
        ch=sc.next().charAt(0);
       }
        while(ch=='y');
    }
    
}
