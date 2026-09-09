package DoublyLinkedList;

public class Node {
    Product data;
    //Trỏ đến Node phía trước
    Node prev;
    //Trỏ đến node phía sau
    Node next;

    //Khởi tạo node mới
    public Node(Product data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
