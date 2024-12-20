public class DeleteAtIndex {
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
        int size= 0;
        void add(int data){
            Node temp= new Node(data);
            if(head==null){
                head= temp;
            }
            else{
                tail.next= temp;
            }
            tail= temp;
            size++;
        }

        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }

        //delete element from linkedlist at a specific index
        void delete(int index){
            Node temp= head;
            for(int i=0; i<index-1; i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(2);
        l.add(8);
        l.add(7);
        l.add(9);
        l.add(1);

        l.display();
        System.out.println();
        System.out.println("Original size: " + l.size);

        l.delete(1);
        l.display();
        System.out.println();
        System.out.println("Size after element deletion: " + l.size);

    }
}
