class threadone implements Runnable  //class-Inhertiance hierichiary
{
    @Override
    public void run()  //hari-method
    {
        for(int i=0;i<5;i++)
            System.out.println("Hari");
       try
       {
           Thread.sleep(8000);
       }
       catch(InterruptedException e)
       {
         
       }
    }
}
class threadtwo extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println(i);
        try
        {
        Thread.sleep(6000);
        }
        catch(InterruptedException e)
                {
            
                }
    }
}




public class MultiThread {
    public static void main(String[]args)
    {
             Runnable a=new threadone();//a-thread
             threadtwo b=new threadtwo();
             Thread t1=new Thread(a);
              t1.getPriority();
             t1.setName("threadone");
             System.out.println(t1.getName());
             t1.setPriority(Thread.MAX_PRIORITY);
             t1.getPriority();
             t1.start();//run
             b.start();
             try
             {
            // a.join();
             b.join();
             
             System.out.println("bye...");
             }
             catch(InterruptedException ex)
             {
                 
             }
    }
}
