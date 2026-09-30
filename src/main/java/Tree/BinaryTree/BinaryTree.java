package Tree.BinaryTree;

public class BinaryTree {
    //Tạo ra gốc
    Node root;

    public void setRoot(int data){
        this.root = new Node(data);
    }

    //Thêm node vào cây
    public void addNode(Node parent, Node child){
        if(parent.left == null){
            parent.left = child;
        } else if (parent.right == null) {
            parent.right = child;
        }
    }

    //Tìm node trái nhất
    public Node findMostLeft(Node node){
        if(node == null){
            return null;
        } else if (node.left == null) {
            return node;
        }
        Node child = node.left;
        return findMostLeft(child);
    }

    //Thêm node trái nhất
    public void addLeftNode(int data){
        //Lấy node trái nhất
        Node node = findMostLeft(root);

        if(node != null){
            Node newNode = new Node(data);
            node.left = newNode;
        }
    }

    //Tìm node phải nhất
    public Node findMostRight(Node node){
        if(node == null){
            return null;
        } else if (node.right == null) {
            return node;
        }
        Node child = node.right;
        return findMostRight(child);
    }

    //Thêm phải nhất
    public void addMostRight(int data){
        Node node = findMostRight(root);

        if(node != null){
            node.right = new Node(data);
        }
    }

    //In cây
    public void printTree(Node node, int level){
        if(node == null){
            return;
        }
        for(int i = 0; i < level; i++){
            System.out.println("   ");
        }
        System.out.println("- " + node.data);
        printTree(node.left, level + 1);
        printTree(node.right, level + 1);
    }

    //PreOrder
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " > ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //PostOrder
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        System.out.print(node.data + " > ");
        postOrder(node.right);
    }
}
