public class GetElementAtIndex {

    //LinkedList Node
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }

    //LinkedList implementation
    static class LinkedList{
        Node head= null;
        Node tail= null;

        //add new nodes in linkedlist at tail
        void add(int data){
            Node temp= new Node(data);
            if(head==null){
                head= temp;
            }
            else{
                tail.next= temp;
            }
            tail= temp;
        }

        //display the linkedlist
        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp= temp.next;
            }
        }

        //get element value of a specific index in linkedlist
        void getElement(int index){
            Node temp= head;
            for(int i=0; i<index; i++){
                temp= temp.next;
            }
            System.out.println("Element at index " + index + " = " + temp.data);
        }

    }
    public static void main(String args[]){
        LinkedList l= new LinkedList();
        l.add(6);
        l.add(1);
        l.add(9);
        l.add(2);

        l.display();
        System.out.println();

        l.getElement(2);
    }
}
