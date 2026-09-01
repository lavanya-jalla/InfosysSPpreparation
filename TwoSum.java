import java.util.HashSet;

public class TwoSum {
    static boolean twoSum(int[] arr,int target){
    HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int needed=target-current;
            if(seen.contains(needed)){
                return true;
            }
            seen.add(current);

        }

    
    return false;
  }
    public static void main(String[] args) {
       int[] arr = {2, 7, 11, 15};

System.out.println(twoSum(arr, 9));   // true
System.out.println(twoSum(arr, 20));// fasle
    }

    
}
