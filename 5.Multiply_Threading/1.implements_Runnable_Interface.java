class UpdateDatebase implements Runnable{
    @Override
    public void run(){
        for(byte i=0;i<=5;i++){
            try {
                System.out.println("Datebase is updating.........");
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
               
            }
        }
    }
}


class ConnectingDatebase extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i=i+2){
            try{
            System.out.println("Date is connecting please wait.........."+ i +"sec");
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
}


public class MutipleThreadingEX {
    public static void main(String args[]) throws InterruptedException{
        
       Runnable updb=new UpdateDatebase();
        ConnectingDatebase cndb=new ConnectingDatebase();
        
        Thread t1=new Thread(updb);
        
        //updb.upDatebase();
        t1.start();
        cndb.start();
        
        t1.join();
        cndb.join();
        
        System.out.println("bye......");
    }
}
