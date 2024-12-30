public class FindDuplicate {
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

        void findDuplicate(){
            if(top==-1){
                System.out.println("Stack underflow");
                return;
            }
            boolean visited[]= new boolean[top];
            for(int i=0; i<top; i++){
                if(visited[i]==false){
                    for(int j=i+1; j<top; j++){
                        if(stackArray[i]==stackArray[j]){
                            System.out.print(stackArray[i] + " ");
                            visited[j]= true;
                            break;
                        }
                    }
                }
            }
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
    }
    public static void main(String[] args) {
        Stack st= new Stack(8);
        st.push(4);
        st.push(7);
        st.push(2);
        st.push(8);
        st.push(7);
        st.push(4);
        st.push(7);

        st.display();

        System.out.print("Duplicate elements: ");
        st.findDuplicate();
    }
}
