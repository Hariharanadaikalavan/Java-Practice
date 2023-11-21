public class Recurssion {
    
    public int sum(int num)
    {
    if(num==0)
    {
        return 1;
    }else{
     return num*sum(num-1);
     
}
    }
    
    
    public static void main(String args[])
    {
        Recurssion obj=new Recurssion();
        System.out.println(obj.sum(5));
    }
}
