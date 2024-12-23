import java.util.*;
public class CopyStackThroughArray {

    static void copyStack(Stack<Integer> st){
        Stack<Integer> s= new Stack<>();
        int size= st.size();
        int a[]= new int[size];
        for(int i=a.length-1; i>=0; i--){
            a[i]= st.peek();
            st.pop();
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(7);
        st.push(2);
        st.push(4);
        st.push(9);
        st.push(6);

        copyStack(st);
    }
}
