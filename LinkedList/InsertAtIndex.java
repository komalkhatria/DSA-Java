public class InsertAtIndex {
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

        void insertAtIndex(int index, int val){
            Node temp= head;
            Node t= new Node(val);
            for(int i=0; i<index-1; i++){
                temp= temp.next;
            }
            t.next= temp.next;
            temp.next= t;
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
        l.add(13);
        l.add(21);
        l.add(24);
        l.add(41);
        l.insertAtIndex(2, 100);

        l.display();

    }
}