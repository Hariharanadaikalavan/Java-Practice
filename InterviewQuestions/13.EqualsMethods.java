class EqualAndEquals{
    public static void main(String hari[]){
        String s1="hari";
        String s2="haran";
        String s3=s1+s2;
        String s4=new String("hariharan");
         s4=s4.intern();
        
        System.out.println(s3==s4);//false its fetch the object referance from string pool
         System.out.println(s3.equals(s4));//true It's comparsion o two objects
          System.out.println(s3.equalsIgnoreCase(s4));// Its compared the two objects irrespective of case sensitive
    }
}
