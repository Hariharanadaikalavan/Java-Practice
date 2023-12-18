public class Constructor_InNumber {
    int x;
    int y;
Constructor_InNumber(){
    x=10;
    y=10
        0;
    System.out.println("Default Constructor Executed Sucessfully");
}
Constructor_InNumber(int a,int b){
    x=a;
    y=b;
}
Constructor_InNumber(int a){
    x=a;
}

void display(){
System.out.println(x+"  "+y);
}



public static void main(String hari[]){
    Constructor_InNumber objname= new Constructor_InNumber();
Constructor_InNumber objname2=new Constructor_InNumber(30);
Constructor_InNumber objname1=new Constructor_InNumber(20,20);


objname1.display();

objname2.display();
objname.display();
}
    
}
