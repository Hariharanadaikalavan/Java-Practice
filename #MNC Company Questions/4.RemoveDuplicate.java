public class RemoveDuplicate {
    public static void main(String args[]){
       int arr[]={1,3,3,3,3,3,3,4,4,6,6,6,6,7,7,7,8,8}; 
        int j=1;
       for(int i=0;i<arr.length;i++)
       {
                 if(arr[i]!=arr[j])
                 {
                     arr[j]=arr[i];
                    System.out.println(arr[j]);  
                 }
       }       
  }
}
