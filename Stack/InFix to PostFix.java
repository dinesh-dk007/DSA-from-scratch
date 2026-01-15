import java.util.*;

public class Main {
    public static void main(String[] args) {
      String inFix = "a+b*(c^d-e)";
      Stack<Character> stk = new Stack<>();
      StringBuilder sb = new StringBuilder();
      Map<Character,Integer> map = new HashMap<>();
      map.put('^',1);
      map.put('*',2);
      map.put('/',2);
      map.put('+',3);
      map.put('-',3);
      
      for(char c : inFix.toCharArray()){
        if(Character.isLetterOrDigit(c)){
          
            sb.append(c);
        }
        else if(c == '('){
          
            stk.push(c);
            
        }else if(c == ')'){
          
            while(!stk.isEmpty() && stk.peek() != '('){
              sb.append(stk.pop());
            }
            stk.pop();
            
        }else{
            while(!stk.isEmpty() && stk.peek() != '('&& map.get(c) >= map.get(stk.peek())){
              
              sb.append(stk.pop());
            }
            stk.push(c);
        }
      }
      while(!stk.isEmpty()){
        
        sb.append(stk.pop());
        
      }
      System.out.print("PostFix: " + sb.toString());
      
  }
  
}