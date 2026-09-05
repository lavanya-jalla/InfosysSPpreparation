import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
     static void queueProblem(int[] arr){
         Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
             queue.offer(arr[i]);
        }
         System.out.println("Initial Queue: " + queue);
        if(queue.isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        else{
          System.out.println("Front element (peek): " + queue.peek());
        }
        System.out.println("Removed element (poll): " + queue.poll());
      System.out.println("After fornt element removed Queue: " + queue);
           
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        queueProblem(arr);
        sc.close();
    }

    
}
