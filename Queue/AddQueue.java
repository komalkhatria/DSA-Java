public class AddQueue {
    static class Queue{
        int maxsize;
        int queueArray[];
        int front;
        int rear;
        Queue(int size){
            maxsize= size;
            queueArray= new int[size];
            front= -1;
            rear= -1;
        }

        void add(int val){
            if(rear==maxsize-1){
                System.out.println("The queue is full");
                return;
            }
            if(rear==-1){
                queueArray[++rear]=val;
                front= 0;
                queueArray[front]=val;
                System.out.println(val + " added in queue");
            }
            else{
                queueArray[++rear]= val;
                System.out.println(val + " added in queue");
            }
        }
        void display(){
            if(rear==-1){
                System.out.print("Empty queue");
                return;
            }
            for(int i= front; i<=rear; i++){
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(3);
        q.add(6);
        q.add(2);
        q.add(7);
        q.add(4);

        q.display();
    }
}
