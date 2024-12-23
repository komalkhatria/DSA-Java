public class SortZeroOneTwo {
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

        void sortZeroOneTwo(){
            Node temp= head;
            int countZero= 0;
            int countOne= 0;
            int countTwo= 0;
            while(temp!=null){
                if(temp.data== 0){
                    countZero++;
                }
                else if(temp.data==1){
                    countOne++;
                }
                else if(temp.data==2){
                    countTwo++;
                }
                temp= temp.next;
            }
            temp= head;
            while(temp!=null){
                while(countZero!=0){
                    System.out.print(0 + " ");
                    countZero--;
                }
                while(countOne!=0){
                    System.out.print(1 + " ");
                    countOne--;
                }
                while(countTwo!=0){
                    System.out.print(2 + " ");
                    countTwo--;
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.add(2);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(0);
        l.add(1);
        l.add(0);

        System.out.print("Original linkedlist: ");
        l.display();

        System.out.println();
        System.out.print("Sorted linkedlist: ");
        l.sortZeroOneTwo();

    }
}
