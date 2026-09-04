import java.util.Scanner;

public class RecursiveArraySum {
      static int recursivearraySum(int[] arr,int index){
      if(index==arr.length){
        return 0;
      }
      return arr[index]+recursivearraySum(arr,index+1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
       System.out.println("Enter array");
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
        System.out.println("Sum of an array: ");
      System.out.println(recursivearraySum(arr,0));

        sc.close();
    
}

    
}
