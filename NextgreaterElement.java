import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextgreaterElement {
     static int[] nextGreater(int[] arr){
        int[] result =new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
           while(!stack.isEmpty() && stack.peek()<=arr[i]){
               stack.pop();
           }
            if(stack.isEmpty())
            {
                result[i]=-1;
            }
            else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
            
                }
            
    return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nextGreater(arr)));
    }

    
}
