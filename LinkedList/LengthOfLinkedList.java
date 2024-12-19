public class LengthOfLinkedList {
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
            Node t= new Node(data);
            if(head==null){
                head= t;
            }
            else{
                tail.next=t;
            }
            tail= t;
        }
        void display(){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp= temp.next;
            }
        }
        void findLength(){
            Node temp= head;
            int size= 0;
            while(temp!=null){
                size++;
                temp= temp.next;
            }
            System.out.println("Size of linkedlist is " + size);
        }
    }
    static void length(Node head){
        Node temp= head;
        int size= 0;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        System.out.println("Size of second linkedlist is " + size);
    }
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(3);
        l.add(7);
        l.add(12);
        l.add(9);
        l.add(15);
        l.display();
        System.out.println();
        l.findLength();

        Node a= new Node(12);
        Node b= new Node(13);
        Node c= new Node(14);
        Node d= new Node(15);

        a.next= b;
        b.next= c;
        c.next= d;
        d.next= null;

        length(a);

    }
}
