public class RemoveDuplicates {
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
        void display(Node head){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }
        Node removeDuplicate(Node head){
            Node temp1= head;
            while(temp1 !=null){
                Node temp2= temp1;
                while(temp2.next != null){
                    if(temp2.next.data == temp1.data){
                        temp2.next= temp2.next.next;
                    }
                    else{
                        temp2= temp2.next;
                    }
                }
                temp1= temp1.next;
            }
            return head;
        }
    }
    public static void main(String[] args) {

        Node a= new Node(12);
        Node b= new Node(11);
        Node c= new Node(12);
        Node d= new Node(21);
        Node e= new Node(41);
        Node f= new Node(43);
        Node g= new Node(21);

        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;
        e.next= f;
        f.next= g;

        LinkedList l= new LinkedList();

        System.out.print("Original linked list: ");
        l.display(a);
        System.out.println();

        Node x= l.removeDuplicate(a);
        System.out.print("Duplicates removed: ");
        l.display(x);
    }
}