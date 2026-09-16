package Stack.StackByArray;

public class ArrayStack {
    //So luong phan tu cua stack
    private int capacity;
    //Mang
    private int[] array;
    //top
    private int top;

    //Khoi tao stack voi capacity cho truoc
    public ArrayStack(){
        this.capacity = 10;
        this.array = new int[capacity];
        this.top = - 1;
    }

    //Khoi tao stack voi capacity nhap tu ban phim
    public ArrayStack(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = - 1;
    }

    //Push
    public void push(int value){
        //Kiem tra stack day chua
        if(isFull()){
            System.out.println("Stack day, khong the them");
            return;
        } else {
            array[++top] = value;
        }
    }

    //Pop
    public int pop(){
        //Kiem tra stack co rong khong
        if(isEmpty()){
            System.out.println("Stack rong, khong the pop");
            return -1;
        } else {
            return array[top--];
        }
    }

    //isEmpty
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    //isFull
    public boolean isFull(){
        if(top == capacity - 1){
            return true;
        }
        return false;
    }

    //Peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack rong");
            return -1;
        } else {
            return array[top];
        }
    }

}
