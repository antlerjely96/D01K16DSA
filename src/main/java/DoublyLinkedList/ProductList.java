package DoublyLinkedList;

public class ProductList {
    Node head;
    Node tail;

    //Khởi tạo danh sách (constructor)
    public ProductList(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    //In danh sách từ đầu -> cuối
    public void printForward(){
        //Kiểm tra danh sách có rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else {
            //Duyệt từ head -> tail
            Node currentNode = head;
            while (currentNode != null){
                System.out.println("ID: " + currentNode.data.Id + ", Name: " + currentNode.data.Name + ", Price: " + currentNode.data.Price + ", Quantity: " + currentNode.data.Quantity);
                currentNode = currentNode.next;
            }
        }
    }

    //In danh sách từ cuối -> đầu
    public void printBackword(){
        //Kiểm tra danh sách có rỗng không
        if(tail == null){
            System.out.println("Danh sách rỗng");
        } else {
            //Duyệt từ tail -> head
            Node currentNode = tail;
            while (currentNode != null){
                System.out.println("ID: " + currentNode.data.Id + ", Name: " + currentNode.data.Name + ", Price: " + currentNode.data.Price + ", Quantity: " + currentNode.data.Quantity);
                currentNode = currentNode.prev;
            }
        }
    }

    //Tìm kiếm Node theo data.Id
    public void findNodeByDataId(int Id){
        //Kiểm tra danh sách có rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.Id == Id){
                    System.out.println("ID: " + currentNode.data.Id + ", Name: " + currentNode.data.Name + ", Price: " + currentNode.data.Price + ", Quantity: " + currentNode.data.Quantity);
                }
                currentNode = currentNode.next;
            }
        }
    }

    //Thêm node vào đầu danh sách
    public void addNoteFirst(Product product){
        Node newNode = new Node(product);
        //Kiểm tra danh sách có rỗng không
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //Thêm node vào cuối danh sách
    public void addNoteLast(Product product){
        Node newNode = new Node(product);
        //Kiểm tra danh sách có rỗng không
        if(tail == null){
            tail = head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Thêm node mới vào sau 1 node có data.Id được chọn
    public void addNodeAfterAnyNodeFollowDataId(int Id, Product product){
        //Kiểm tra danh sách có rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng, không thêm được");
        } else {
            //Duyệt từ đầu -> cuối
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.Id == Id){
                    Node newNode = new Node(product);
                    if(currentNode == tail){
                        newNode.prev = tail;
                        tail.next = newNode;
                        tail = newNode;
                    } else {
                        //Node tiếp theo của node hiện tại
                        Node nextNode = currentNode.next;
                        //Trỏ next của currentNode vào newNode
                        currentNode.next = newNode;
                        //Trỏ next của newNode vào nextNode
                        newNode.next = nextNode;
                        //Trỏ prev của nextNode vào newNode
                        nextNode.prev = newNode;
                        //Trỏ prev của newNode vào currentNode
                        newNode.prev = currentNode;
                    }
                }
                currentNode = currentNode.next;
            }
        }
    }

    //Xóa phần tử đầu tiên
    public void deleteNodeFirst(){
        //Kiểm tra danh sách có rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng, không xóa được");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    //Xóa phần tử cuối cùng
    public void deleteNodeLast(){
        //Kiểm tra danh sách có rỗng không
        if(tail == null){
            System.out.println("Danh sách rỗng, không thêm được");
        } else if (tail == head) {
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    //Xóa phần tử theo data.Id
    public void deleteNodeByDataId(int Id){
        //Kiểm tra danh sách có rỗng không
        if(tail == null){
            System.out.println("Danh sách rỗng, không xóa được");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.Id == Id){
                    if(currentNode == head){
                        deleteNodeFirst();
                    } else if (currentNode == tail) {
                        deleteNodeLast();
                    } else {
                        //Node trước node cần xóa
                        Node prevNode = currentNode.prev;
                        //Node sau node cần xóa
                        Node nextNode = currentNode.next;
                        //Trỏ next của prevNode sang nextNode
                        prevNode.next = nextNode;
                        //Trỏ prev của nextNode sang prevNode
                        nextNode.prev = prevNode;
                    }
                }
                currentNode = currentNode.next;
            }
        }
    }

    //Đếm số node
    public void countNode(){
        int count = 0;
        //Kiểm tra danh sách có rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                count++;
                currentNode = currentNode.next;
            }
            System.out.println("Danh sách có " + count + " node");
        }
    }
}
