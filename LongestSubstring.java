import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {
    static int longestSubstring(String str){
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int longest=0;
        for(int right=0;right<str.length();right++){
            char current=str.charAt(right);
           while(set.contains(current)){
           set.remove(str.charAt(left));
            left++;
        }
        set.add(current);
    longest=Math.max(longest,right-left+1);
    }
    return longest;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        System.out.println(longestSubstring(str));
        sc.close();
    }

    
}
