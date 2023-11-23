public class ConstructorEX_overloading {
    
    int age;
    String name;
  
      ConstructorEX_overloading(){
       //System.out.println("Default Constructor"); 
      }
      
       ConstructorEX_overloading(int i,String n){
           age=i;
           name=n;
       }
       
        ConstructorEX_overloading(String n,int i){
           age=i;
           name=n;
       }
       void display(){
           System.out.println(age+"" +name);
       }
      public static void main(String args[]){
           ConstructorEX_overloading obj=new  ConstructorEX_overloading();
           ConstructorEX_overloading obj1=new  ConstructorEX_overloading(22,"hari");
            ConstructorEX_overloading obj2=new  ConstructorEX_overloading("hari",22);
           
           obj1.display();
            obj2.display();
            obj.display();
      }
}
