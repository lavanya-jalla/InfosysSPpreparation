import java.util.Scanner;

public class RecursivePalindrome {
    static boolean recursivePalindrome(String str,int left, int right){
      
      if(left>=right){
        return true;
      }
      if(str.charAt(left)!=str.charAt(right)){
        return false;
      }
    
      return recursivePalindrome(str,left+1,right-1);
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
      String str=sc.nextLine();
      System.out.println(recursivePalindrome(str,0,str.length()-1));

        sc.close();
    }
 
}

