// import java.util.HashSet;
// public class FirstRepated{
//     static int firstRepeat(int[] arr){
//         HashSet<Integer> seen=new HashSet<>();
//         int current=-1;
//         for(int i=0;i<arr.length;i++){
//             current=arr[i];
//             if(seen.contains(current)){
//                 return current;
//             }
//             seen.add(current);
//         }
//         return -1;
//     }

// public static void main(String[] args){
//     int[] arr={4,5,1,2,1,6};
//     System.out.println(firstRepeat(arr));
// }
// }



//hashmap
import java.util.HashMap;
public class FirstRepated{
    static int firstRepeat(int[] arr){
        HashMap<Integer, Integer> count=new HashMap<>();
        for(int num:arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(count.get(num)>1){
                return num;
            }
        }
        
        return -1;
    }

public static void main(String[] args){
    int[] arr={4,5,1,5,1,6};
    System.out.println(firstRepeat(arr));
}
}