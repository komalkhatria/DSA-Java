public class InsertAtHead {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
    }
    static class LinkedList{
        Node head= null;
        Node tail= null;
        void insertAtHead(int val){
            Node temp= new Node(val);

            if(head==null){
                head= temp;
                tail= temp;
            }
            else{
                temp.next= head;
                head= temp;
            }
        }
        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.insertAtHead(58);
        l.insertAtHead(42);
        l.insertAtHead(91);
        l.insertAtHead(3);
        l.insertAtHead(17);

        l.display();
    }
}
