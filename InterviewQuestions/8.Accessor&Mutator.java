miclass Dummy{
private String username;
private int age;
private String email;
private long phoneNumber;

public String getUsername(){
return username;
}

public void setUsername(String username){
this.username=username;
}

public int getAge(){
return age;
}

public void setAge(int age){
this.age=age;
}

public String getEmail(){
return email;
}

public void setEmail(String email){
this.email=email;
}

public long getPhoneNumber(){
return phoneNumber;
}

public void setPhoneNumber(long phoneNumber){
    this.phoneNumber = phoneNumber;
}

public String tostring(){
    String str=getUsername();
            return str;
}


public static void main(String args[]) {
    final Dummy obj = new Dummy();
    obj.setUsername("Ramanathan");
    obj.setAge(23);
    obj.setEmail("@gmail.com");
    obj.setPhoneNumber(989447);

    System.out.println(obj.tostring());

}
}
