public class IntersectionOfTwoLinkedLists{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public Node getIntersectionNode(Node headA, Node headB){
        Node tempA= headA;
        Node tempB= headB;

        int lengthA= 0;
        while(tempA!= null){
            lengthA++;
            tempA= tempA.next;
        }

        int lengthB= 0;
        while(tempB!= null){
            lengthB++;
            tempB= tempB.next;
        }

        tempA= headA;
        tempB= headB;

        if(lengthA> lengthB){
            int steps= lengthA- lengthB;
            for(int i=0; i<steps; i++){
                tempA= tempA.next;
            }
        }

        else if(lengthB> lengthA){
            int steps= lengthB- lengthA;
            for(int i=0; i<steps; i++){
                tempB= tempB.next;
            }
        }

        while(tempA!= tempB){
            tempA= tempA.next;
            tempB= tempB.next;
        }
        return tempA;
    }

    public static void main(String args[]){

        Node a= new Node(4);
        Node b= new Node(1);
        Node c= new Node(8);
        Node d= new Node(4);        // Intersection starts here
        Node e= new Node(5);
        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;

        Node p= new Node(6);
        Node q= new Node(7);
        p.next= q;
        q.next= d;      // Point q.next to the intersection node

        IntersectionOfTwoLinkedLists obj= new IntersectionOfTwoLinkedLists();
        Node intersect= obj.getIntersectionNode(a, p);
        if (intersect != null) {
            System.out.println("Intersection at node with value: " + intersect.data);
        } else {
            System.out.println("No intersection found.");
        }

    }
}


