public class MiddleOfLinkedList {
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
            if(head==null){
                head= temp;
            }
            else{
                tail.next= temp;
            }
            tail= temp;
        }

        void display(){
            Node temp= head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }

        void middleElement(){
            Node temp= head;
            int length= 0;
            while(temp != null){
                length++;
                temp= temp.next;
            }
            temp= head;
            for(int i=0; i<length/2; i++){
                temp= temp.next;
            }
            System.out.println("Middle element= " + temp.data);
        }
    }

    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(4);
        l.add(7);
        l.add(1);
        l.add(3);

        l.display();
        System.out.println();

        l.middleElement();
    }
}
