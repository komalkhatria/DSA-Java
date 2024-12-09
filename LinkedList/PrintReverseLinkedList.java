public class PrintReverseLinkedList {
    //LinkedList node
    static class Node{
        int data;       //stores data
        Node next;      //address of linked node

        //Constructor to create new Node
        Node(int data){
            this.data= data;
        }
    }

    //print linkedlist
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //reverse the node linking in backward direction
    static Node reverse(Node head) {
        Node pre = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static void main(String[] args) {

        // Create nodes of linkedlist
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);

        // Link each node to its next node
        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;
        e.next= null;

        System.out.print("Forward linkedlist: ");
        display(a);
        System.out.println();

        System.out.print("Reversed linkedlist: ");
        // Storing the reversed node in a reference variable
        Node rev= reverse(a);
        display(rev);       //Printing the linkedlist with reversed nodes

    }
}
