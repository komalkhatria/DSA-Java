import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix= "-9/*+5346";
        System.out.println("Postfix expression: " + prefix);
        System.out.print("Infix expression: ");

        Stack<String> val= new Stack<>();

        for(int i=prefix.length()-1; i>=0; i--){
            char ch= prefix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v1= val.pop();
                String v2= val.pop();
                char op= ch;
                String temp= v1+op+v2;
                val.push(temp);
            }
        }
        System.out.println(val.peek());
    }
}