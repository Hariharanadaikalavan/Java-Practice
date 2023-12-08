interface ReverseBank{
    void fixedDesposite();
}
interface WorldBank{
    void grossDp();
}

class Bank implements ReverseBank,WorldBank {
    public void fixedDesposite(){
        System.out.println("ReverseBank");
    }
    public void grossDp(){
        
        System.out.println("worldbank");
    }

}

class Banks implements ReverseBank,WorldBank{
     public void fixedDesposite(){
        System.out.println("ReverseBank");
    }
    public void grossDp(){
        
        System.out.println("worldbank");
    }

    public static void main(String args[]){
        Bank obj=new Bank();
        obj.fixedDesposite();
        obj.grossDp();
        
        Banks obj1=new Banks();
        obj1.fixedDesposite();
        obj1.grossDp();
        
    }
}
