import java.util.HashMap;

public class NonRepeat {
    static char nonRepeat(String str){
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
        
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }  for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
       
            if(map.get(ch)==1){
                    return ch;
            }
    }
            
        return '\0';
            }

    public static void main(String[] args) {
        
        System.out.println(nonRepeat("swiss"));
        System.out.println(nonRepeat("aabbcde"));
        System.out.println(nonRepeat("aabbcc"));

    }

    
}
