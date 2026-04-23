//leetcode problem no.20
// Approach: Stack
import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='('|| s.charAt(i)=='{'||s.charAt(i)=='[')
          st.push(s.charAt(i));
          else{
         if(st.isEmpty())
         return false;
         char top = st.pop();
         if(s.charAt(i)==')' && top!= '(')
         return false;
         if(s.charAt(i)=='}' && top!= '{')
         return false;
         if(s.charAt(i)==']' && top!= '[')
         return false;
          }
        }
        return st.isEmpty();

    }
}