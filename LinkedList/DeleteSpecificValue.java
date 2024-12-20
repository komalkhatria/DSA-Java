public class DeleteSpecificValue {
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
        void add(int value){
            Node temp= new Node(value);
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

        //delete node from linkedlist with a specific value
        void delete(int value){
            Node temp= head;
            int index=-1;
            while(temp.data!=value){
                temp= temp.next;
                index++;
            }

            temp= head;
            for(int i=0; i<index; i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            size--;
        }
    }
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(9);
        l.add(3);
        l.add(7);
        l.add(8);
        l.add(2);

        l.display();
        System.out.println();

        l.delete(7);
        l.display();

    }
}
