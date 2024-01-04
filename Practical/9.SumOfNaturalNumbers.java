public class sumofnatural {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
      String choice;
      do
      {
          int i,sum=0,n;
        System.out.println("Enter the number you want to sumupto from zero");
        n=sc.nextInt();
        for(i=0;i<n;i++)  
        {
            if(i%2!=0)
            {
            sum=sum+i;
            }
              
        }
           System.err.println("Sum of" +n+ "Natural Number  "    +sum);
            choice=sc.nextLine();
            System.out.println("Do you want to Continue");
            
      }
      
      while(choice.equals("yes"));
    }
    
}
