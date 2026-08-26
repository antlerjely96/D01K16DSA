package SinglyLinkedList;

public class Node {
    //Data: giá trị của phần tử
    Product data;
    //Next: thông tin của phần tử tiếp theo
    Node next;

    public Node(Product data) {
        this.data = data;
        this.next = null;
    }
}
