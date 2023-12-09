public class GapSum {
    public static void main(String args[]){
        int sum=0;
        int arr[]={1,2,3,4,5,6,7,8,9};
        int gap=2;
        
        for(int j=0;j<gap;j++){
        
        for(int i=j;i<9;i=i+gap){
            sum=sum+arr[i];
        }
        
        System.out.print(sum+",");
        }
    }
}
