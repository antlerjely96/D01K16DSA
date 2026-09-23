package Queue.Array;

public class ArrayQueue {
    public int capacity;
    public int[] queue;
    public int rear;

    //Khởi tạo queue
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.rear = 0;
    }

    //Enqueue: thêm phần tử vào hàng đợi
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Hàng đợi đầy, không thể enqueue");
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    //Dequeue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Hàng đợi rỗng, không dequeue được");
            return -1;
        } else {
            int front = queue[0];
            System.out.println("Phần tử được dequeue" + front);
            //Dịch các phần tử lên 1 vị trí
            for (int i = 0; i < rear - 1; i++){
                queue[i] = queue[i + 1];
            }
            rear--;
            return front;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        if(rear == 0){
            return true;
        }
        return false;
    }

    //isFull
    public boolean isFull(){
        if(rear == capacity){
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
            System.out.println("Phần tử đầu hàng đợi: " + queue[0]);
            return queue[0];
        }
    }
}
