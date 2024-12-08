public class LinkedList1 {

    //LinkedList Node
    static class Node{
        int data;
        Node next;

        // Constructor to create a new node
        // next is by default initialized as null
        Node(int data){
            this.data= data;
        }
    }

    public static void main(String[] args) {
        //Creating individual nodes (not linked)
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);

        //Printing individual nodes
        System.out.println(a.next + " " + a.data);
        System.out.println(b.next + " " + b.data);
        System.out.println(c.next + " " + c.data);
    }
}
