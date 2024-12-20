public class SortZeroOne {
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
            while(temp!= null){
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
        }

        void sortZeroOne(){
            Node temp= head;
            int countZero= 0;
            int countOne= 1;
            while(temp!=null){
                if(temp.data== 0){
                    countZero++;
                }
                else if(temp.data==1){
                    countOne++;
                }
                temp= temp.next;
            }
            temp= head;
            while(temp!=null){
                while(countZero!=0){
                    System.out.print(0 + " ");
                    countZero--;
                }
                while(countOne!=1){
                    System.out.print(1 + " ");
                    countOne--;
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(1);
        l.add(0);
        l.add(1);
        l.add(1);
        l.add(0);
        l.add(1);
        l.add(0);

        System.out.print("Original linkedlist: ");
        l.display();

        System.out.println();
        System.out.print("Sorted linkedlist: ");
        l.sortZeroOne();

    }
}
