import java.util.*;
public class ValidParentheses {
    static boolean isBalanced(String s){
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    return false;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        String s= "(()(()))";
        System.out.println(s);
        if(isBalanced(s)){
            System.out.println("Valid Parentheses");
        }
        else{
            System.out.println("Invalid Parentheses");
        }
    }
}
