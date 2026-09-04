import java.util.Scanner;

public class RecursiveReverseOfString {
      static String recursiveReverse(String str){
      if(str.length()==0){
        return "";
      }
      return recursiveReverse(str.substring(1))+str.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
      String str=sc.nextLine();
       System.out.println("Reverse of a given string: ");
      System.out.println(recursiveReverse(str));

        sc.close();
    }
 
}

    

