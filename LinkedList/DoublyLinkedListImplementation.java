public class DoublyLinkedListImplementation {
    static class Node{
        int data;
        Node previous;
        Node next;
        Node(int data){
            this.data= data;
        }
    }

    static class LinkedList{
        Node head= null;
        Node tail= null;
        void add(int value){
            Node temp= new Node(value);
            if(head==null){
                head= temp;
                tail= temp;
                head.previous= null;
            }
            else{
                temp.previous= tail;
                tail.next= temp;
                tail= temp;
            }
        }
        void display(){
            Node start= head;
            Node end= tail;

            System.out.print("Forward Traversal: ");
            while(start!=null){
                System.out.print(start.data + " ");
                start= start.next;
            }
            System.out.println();

            System.out.print("Backward Traversal: ");
            while(end!=null){
                System.out.print(end.data + " ");
                end= end.previous;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(7);
        l.add(5);
        l.add(9);
        l.add(4);

        l.display();
    }
}
