package SinglyLinkedList;

public class ProductList {
    //Tạo node head của danh sách
    Node head;

    //Tạo danh sách
    public ProductList(Node head) {
        this.head = null;
    }

    //In danh sách
    public void displayList(){
        //Kiểm tra danh sách rỗng hay không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else {
            //Bắt đầu duyệt từ head
            Node currentNode = head;
            while (currentNode.next != null){
                Product product = currentNode.data;
                System.out.println("id: " + product.Id + ", name: " + product.Name + ", price: " + product.Price + ", Quantity: " + product.Quantity);
                //Sang node tiếp theo
                currentNode = currentNode.next;
            }
        }
    }

    //In 1 node dựa theo id của product
    public void findById(int Id){
        //Kiểm tra danh sách rỗng hay không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else {
            //Bắt đầu duyệt từ head
            Node currentNode = head;
            while (currentNode.next != null){
                if(currentNode.data.Id == Id){
                    System.out.println("id: " + currentNode.data.Id + ", name: " + currentNode.data.Name + ", price: " + currentNode.data.Price + ", Quantity: " + currentNode.data.Quantity);
                }

                //Sang phần tử tiếp theo
                currentNode = currentNode.next;
            }
        }
    }

    //Thêm 1 phần tử vào đầu danh sách
    public void addNodeFirst(Product product){
        //Tạo node mới
        Node newNode = new Node(product);
        //Kiểm tra danh sách rỗng hay không
        if(head == null){
            head = newNode;
        } else {
            //Cho node mới trỏ phần tử đầu tiên
            newNode.next = head;
            //Cho head trỏ vào newNode
            head = newNode;
        }
    }

    //Thêm 1 phần tử vào cuối danh sách
    public void addNodeLast(Product product){
        //Tạo node mới
        Node newNode = new Node(product);
        //Kiểm tra danh sách rỗng hay không
        if(head == null){
            head = newNode;
        } else {
            //Duyệt qua từng phần tử của danh sách
            Node currentNode = head;
            while (currentNode.next != null){
                //Dịch sanh phần tử tiếp theo
                currentNode = currentNode.next;
            }
            //Gán phần tử cuối cùng trỏ đến newNode
            currentNode.next = newNode;
        }
    }

    //Thêm 1 node vào vị trí bất kỳ theo id
    public void addNodeAfterAnyNode(Product product, int Id){
        //Tạo node mới
        Node newNode = new Node(product);
        //Kiểm tra danh sách rỗng hay không
        if(head == null){
            head = newNode;
        } else {
            //Duyệt qua từng node
            Node currentNode = head;
            while (currentNode.next != null){
                if(currentNode.data.Id == Id){
                    //Cho newNode trỏ vào phần tử đứng sau currentNode
                    newNode.next = currentNode.next;
                    //Trỏ currentNode vào newNode
                    currentNode.next = newNode;
                }

                //Sang phần tử tiếp theo
                currentNode = currentNode.next;
            }
        }
    }

    //Xóa node đầu
    public void deleteNodeFirst(){
        //Kiểm tra danh sách rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else if (head.next == null){
            head = null;
        } else {
            head = head.next;
        }
    }

    //Xóa node cuối
    public void deleteNodeLast(){
        //Kiểm tra danh sách rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else if (head.next == null){
            head = null;
        } else {
            //Duyệt qua từng phần tử của danh sách
            Node currentNode = head;
            while (currentNode.next.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    //Xóa phần tử theo product id
    public void deleteNodeByProductId(int Id){
        //Kiểm tra danh sách rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else if(head.data.Id == Id){
            head = head.next;
        } else {
            //Duyệt qua từng node
            Node currentNode = head;
            while (currentNode.next != null && !(currentNode.next.data.Id == Id)){
                //Dịch sang phần tử tiếp theo
                currentNode = currentNode.next;
            }
            if(currentNode.next == null){
                System.out.println("Không có phần tử cần xóa");
            } else {
                currentNode.next = currentNode.next.next;
            }
        }
    }

    //Đếm số phần tử của danh sách
    public void countNode(){
        int count = 0;
        //Kiểm tra danh sách rỗng không
        if(head == null){
            System.out.println("Danh sách rỗng");
        } else {
            //Duyệt qua từng node
            Node currentNode = head;
            while (currentNode != null){
                count++;
                currentNode = currentNode.next;
            }
            //
            System.out.println("Danh sách có " + count + " Node");
        }
    }
}
