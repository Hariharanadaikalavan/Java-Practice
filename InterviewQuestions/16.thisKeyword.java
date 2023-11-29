public class ThisKeyWord {
    String Name;
    int Rollno;
    int Age;
    
    ThisKeyWord(){
        System.out.println("Default Construtor");
    }
    ThisKeyWord(String Name,int Rollno,int Age)
    {
        this.Name=Name;  //If we are give parameter and variable would be different this state compiler to ambigute state confussion state
        this.Rollno=Rollno;
        this.Age=Age;
        
    }
    ThisKeyWord(String s,int R,int A,int b){
        Name=s;
        Rollno=R;
        Age=A;
    }
    void display(){
        System.out.println(Name+"-"+Age+"-"+Rollno);
    }
    
    public static void main(String args[]){
        ThisKeyWord obj=new ThisKeyWord("hari",1804047,23);
        ThisKeyWord obj1=new ThisKeyWord("Revathi",98944,37,55);
        obj.display();
        obj1.display();
    }
}
