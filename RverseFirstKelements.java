import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RverseFirstKelements {
      static void reverseFirstK(Queue<Integer> queue, int k){
        if(k <= 0 || k > queue.size()){
        return;
    }
                int remaining = queue.size() - k;
   Stack<Integer> stack = new Stack<>();
       
        for(int i = 0; i < k; i++){
    stack.push(queue.poll());
}
        while(!stack.isEmpty()){
    queue.offer(stack.pop());
}

        for(int i = 0; i < remaining; i++){
    queue.offer(queue.poll());
}
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an queue : ");
        int n=sc.nextInt();
          Queue<Integer> queue = new LinkedList<>();
           System.out.println("Enter " + n + " queue elements: ");
        for(int i=0;i<n;i++){
          queue.offer(sc.nextInt());
        }
         System.out.println("Enter size of an k : ");
        int k=sc.nextInt();
        reverseFirstK(queue, k);
                System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }

    
}
