import java.util.Arrays;
import java.util.Scanner;
public class RecursiveBinarySearch {
    
static int recursiveBinarySearch(int[] arr,int target,int left,int right){
        if(left>right){
          return -1;
        }
       
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
               return mid;
            }
            else if(arr[mid]<target){
              return recursiveBinarySearch(arr,target,mid+1,right);
            }
            else{
                return recursiveBinarySearch(arr,target,left,mid-1);
            }
    
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter array of elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the target");
        int target=sc.nextInt();
       int result=recursiveBinarySearch(arr,target,0,arr.length-1);
      System.out.println(result);

        sc.close();
    }
 
}
