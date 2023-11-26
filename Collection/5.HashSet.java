class HashSet{
public static void main(String args[]){

Hashset<String>set=new HashSet<String>();

set.add("Hariharan");

Iterator<String> itr=set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
