public class DeleteAtIndex {
    static class Stack{
        private int maxsize;
        private int stackArray[];
        private int top;

        Stack(int size){
            maxsize= size;
            stackArray= new int[maxsize];
            top= -1;
        }

        public void push(int val){
            if(top==maxsize-1){
                System.out.println("Stack overflow");
                return;
            }
            stackArray[++top]= val;
            System.out.println(val + " pushed into stack");
        }

        public int pop(){
            if(top==-1){
                System.out.println("The stack is empty");
                return -1;
            }
            int poppedElement = stackArray[top--];
            System.out.println(poppedElement + " popped from the stack");
            return poppedElement;
        }

        public int deleteAtIndex(int index){
            if(top==-1){
                System.out.println("The stack is empty");
                return -1;
            }
            int deletedElement= stackArray[index];
            for(int i=index; i<top; i++){
                stackArray[i]= stackArray[i+1];
            }
            top--;
            System.out.println(deletedElement + " deleted from index " + index);
            return deletedElement;
        }

        public void display(){
            if(top==-1){
                System.out.println("Empty stack");
                return;
            }
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();       // 1 2 3 4

        st.deleteAtIndex(1);
        st.display();       // 1 3 4

        st.pop();
        st.display();       // 1 3

    }
}