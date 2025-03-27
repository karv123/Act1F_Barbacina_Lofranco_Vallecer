class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");  
            inOrder(root.right);
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");  
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " "); 
        }
    }
}

public class App {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {10, 5, 15, 3, 8, 20};

        for (int data : values) {
            tree.root = tree.insert(tree.root, data);
        }

        System.out.println("In-Order Traversal: ");
        tree.inOrder(tree.root);
        System.out.println(); 

        System.out.println("Pre-Order Traversal: ");
        tree.preOrder(tree.root);
        System.out.println();  

        System.out.println("Post-Order Traversal: ");
        tree.postOrder(tree.root);
        System.out.println();  
    }
}
