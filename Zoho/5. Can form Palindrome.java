import java.util.*;
public class Zoho {
    public static String Palindrome(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int count = 0;
        for(int mp : map.values()){
            if(mp%2 != 0)count++;
            if(count > 1) return "NO";
        }
        return "YES";
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(Palindrome(str));
    }

}
