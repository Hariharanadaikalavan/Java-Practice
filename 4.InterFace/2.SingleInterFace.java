interface SmartPhone{ //Method declaration only
    void call();
    void browser();
    void takePhone();
    void videoCall();
}




public class InterFace implements SmartPhone {
    public void call(){ //Method definition -Concert Methods
        System.out.println("call");
    }
    public void browser(){
        System.out.println("browser");
    }
    public void takePhone(){
        
        System.out.println("takephone");
    }
    public void videoCall(){
        System.out.println("videocall");
    }
    
 
    public static void main(String args[]){
        InterFace obj=new InterFace();
        obj.call();
        obj.browser();
    }
}
