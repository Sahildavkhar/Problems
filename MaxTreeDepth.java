// Time Complexity: O(n) where n is the number of nodes in the binary tree
// Space Complexity: O(h) where h is the height of the binary tree

public class MaxTreeDepth {
    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data1, Node left1, Node right1) {
            data = data1;
            left = left1;
            right = right1;
        }

        public Node(int data1) {
            data = data1;
            left = null;
            right = null;
        }
    }

    public static int  maxDepth(Node root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6);

        System.out.println("Max Depth of Tree is: " + maxDepth(root));
    }
}
