import java.util.Scanner;

public class RecursiveSumofDigits {
     static int recursiveSumofDigits(int n){
      if(n<10){
        return n;
      }
      return n%10+recursiveSumofDigits(n/10);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
      int n=sc.nextInt();
       System.out.println("Sum of Digits of number: ");
      System.out.println(recursiveSumofDigits(n));

        sc.close();
    
 
}

}
