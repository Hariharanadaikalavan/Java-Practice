public class ConstructorEx {
    int val = 10;
    
     int x=m1();
    int m1(){
        System.out.println("m1");
        return 10;
    }
    ConstructorEx(){
        System.out.println(this.val);
        System.out.println("in constructor");
    }
    
    public static void main(String args[]){
      ConstructorEx t =  new ConstructorEx();
      
    }
    }
