import java.util.HashSet;
import java.util.Scanner;

public class LongestConseutive {
    static int longestConseutive(int[] arr){
    HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int currentNumber=num;
                int currentLength=1;
                while(set.contains(currentNumber+1)){
                    currentNumber++;
                    currentLength++;


                }
                longest=Math.max(longest,currentLength);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestConseutive(arr));
    }
    

    //   public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     // Step 1: Take array size
    //     System.out.println("Enter array size:");
    //     int n = sc.nextInt();

    //     // Step 2: Create array dynamically
    //     int[] arr = new int[n];

    //     // Step 3: Take array elements
    //     System.out.println("Enter array elements:");

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     // Step 4: Call the method
    //     int result = longestConsecutive(arr);

    //     // Step 5: Print result
    //     System.out.println("Longest consecutive sequence length: " + result);

    //     sc.close();
    // }
}

