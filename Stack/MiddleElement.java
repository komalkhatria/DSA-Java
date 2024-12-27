public class MiddleElement {
    static class Stack{
        int maxsize;
        int stackArray[];
        int top;
        Stack(int size){
            maxsize= size;
            stackArray= new int[maxsize];
            top= -1;
        }

        void push(int val){
            if(top==maxsize-1){
                System.out.println("Stack overflow");
                return;
            }
            stackArray[++top]= val;
            System.out.println(val + " pushed into stack");
        }

        void display(){
            if(top==-1){
                System.out.println("Empty stack");
                return;
            }
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }

        int midElement(){
            int mid= (top+1)/2;
            return stackArray[mid];
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();

        System.out.println("Middle element: " + st.midElement());
    }
}
