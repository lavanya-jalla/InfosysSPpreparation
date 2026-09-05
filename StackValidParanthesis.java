import java.util.Scanner;
import java.util.Stack;

public class StackValidParanthesis {
    static boolean isValid(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            if(current=='('||current=='{'||current=='['){
                stack.push(current);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(
                    (current==')'&& top!='(')||
                    (current=='}'&& top!='{')||
                    (current==']'&& top!='[')
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println(isValid(str));
    
}
    
}
