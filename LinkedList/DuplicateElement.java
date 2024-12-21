public class DuplicateElement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    static class LinkedList {
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void findDuplicate() {
            Node temp1 = head;
            while (temp1 != null) {
                Node temp2 = temp1;
                while (temp2.next != null) {
                    if (temp2.next.data == temp1.data) {
                        System.out.print(temp1.data + " ");
                        temp2.next = temp2.next.next;
                        break;
                    } else {
                        temp2 = temp2.next;
                    }
                }
                temp1 = temp1.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(3);
        l.add(22);
        l.add(3);
        l.add(12);
        l.add(24);
        l.add(12);
        l.add(18);
        l.add(43);
        l.add(3);

        System.out.print("Original linked list: ");
        l.display();
        System.out.println();

        System.out.print("Duplicate elements are: ");
        l.findDuplicate();
    }
}
