public class SinglyLinkedListImplementation {
    //Linkedlist Node
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    //Linkedlist implementation with add and display methods
    static class Linkedlist{
        Node head= null;
        Node tail= null;
        void add(int data){
            Node temp= new Node(data);
            if(head == null){
                head= temp;
            }
            else{
                tail.next= temp;
            }
            tail= temp;
        }

        void display(){
            Node temp= head;        //marking head as the start of linkedlist so that it prints from the first element
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }
    }
    public static void main(String[] args) {
        // Create linkedlist
        Linkedlist l= new Linkedlist();

        // Add elements
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        // Display linkedlist
        l.display();
    }
}
