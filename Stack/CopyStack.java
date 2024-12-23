import java.util.*;
public class CopyStack {
    static void copy(Stack<Integer> st){
        Stack<Integer> temp= new Stack<>();
        while(st.size()>0){
            int x= st.peek();
            temp.push(x);
            st.pop();
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(3);
        st.push(7);
        st.push(2);
        st.push(9);
        st.push(4);

        System.out.println(st);     //Original stack
        copy(st);       //Copied stack(reversed)
    }
}
