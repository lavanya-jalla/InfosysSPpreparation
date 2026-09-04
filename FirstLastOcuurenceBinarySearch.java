import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOcuurenceBinarySearch {
    static int firstOccurence(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
       int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result= mid;
              right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
    
}
   static int lastOccurence(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result= mid;
              left=mid+1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return result;
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
        int first=firstOccurence(arr,target);
      int last=lastOccurence(arr,target);
      if(first==-1){
        System.out.print("element not found ");
      }
      else{
        System.out.println("first: "+first);
        System.out.println("last: "+last);
      }
        sc.close();
    }
    
}
