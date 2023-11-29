public class MainMethodOverLoading {   
 


public final static void main(String args,int a){
System.out.println(args + "" +a+"overload");
}

public static void main(double args){
    System.out.println(args);
}

public static void main(int args){
    System.out.println(args);
}

public final static void main(String data[]){

main("Batch20",20);
main(200.23);
main(200);
}

}

