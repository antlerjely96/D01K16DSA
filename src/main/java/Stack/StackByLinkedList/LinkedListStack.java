package Stack.StackByLinkedList;

public class LinkedListStack {
    //Top
    private Node top;

//    private int capacity = 10;
//    private int temp = 0;

    //Tao Stack
    public LinkedListStack(){
        this.top = null;
    }

    //Push
    public void push(int value){
//        if(isFull()){
//            System.out.println("Stack day, khong the them");
//        } else {
            //Tao ra phan tu moi
            Node newNode = new Node(value);
            //Cho phan tu moi vao stack (cho newNode la top)
            newNode.next = top;
            top = newNode;
//            temp++;
//        }
    }

    //Pop
    public int pop(){
        //Kiem tra stack co rong khong
        if(isEmpty()){
            System.out.println("Stack rong, khong the pop");
            return -1;
        } else {
            int value = top.data;
            //Cho  top ra ngoai, gan phan tu tiep theo la top
            top = top.next;
            System.out.println("top = " + value);
            return value;
        }
    }

    //isEmpty
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }

    //peek
    public int peek(){
        //Kiem tra stack rong khong
        if(isEmpty()){
            System.out.println("Stack rong");
            return -1;
        } else {
            return top.data;
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
