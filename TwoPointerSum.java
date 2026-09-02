import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerSum {
      static boolean twoPinterSum(int[] arr,int target){
       
    int left=0;
    int right=arr.length-1;
   


while(left < right){

    int sum = arr[left] + arr[right];

    if(sum == target){
        return true;
    }
    else if(sum < target){
        left++;
    }
    else{
        right--;
    }

}
return false;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter sorted elemnts");
        
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
               Arrays.sort(arr);
               System.out.println("enter target:");
               int target=sc.nextInt();
        
        System.out.println(twoPinterSum(arr,target));
        sc.close();
    }

    
}
