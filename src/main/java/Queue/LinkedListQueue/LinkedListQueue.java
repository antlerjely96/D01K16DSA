package Queue.LinkedListQueue;

public class LinkedListQueue {
    Node front;
    Node rear;

//    int capacity = 10;
//    int temp = 0;

    //Khởi tạo queue
    public LinkedListQueue(){
        this.rear = null;
        this.front = null;
    }

    //Enqueue
    public void enQueue(int data){
//        if(isFull()){
//            System.out.println("Hàng đợi đầy, không thể enqueue");
//        } else {
            Node newNode = new Node(data);
            if(isEmpty()){
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
//        }
    }

    //Dequeue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Hàng đợi rỗng, không dequeue được");
            return -1;
        } else {
            int remove = front.data;
            System.out.println("Phần tử được dequeue: " + remove);
            front = front.next;
            if(front == null){
                rear = null;
            }
            return remove;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        if (front == null){
            return true;
        }
        return false;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Hàng đợi rỗng");
            return -1;
        } else {
            System.out.println("Phần tử front: " + front.data);
            return front.data;
        }
    }

    //isFull
//    public boolean isFull(){
//        if(temp == capacity){
//            return true;
//        }
//        return false;
//    }
}
