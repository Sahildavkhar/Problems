import java.util.LinkedList;
import java.util.Queue;

// public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//      }
//   }

public class MaxProductOfBinaryTree {
    long MOD = 1000000007L;
    long ans = 0;

    private long dfs(TreeNode node) {
        if (node == null) return 0;

        node.val += dfs(node.left) + dfs(node.right);
        return node.val;
    }

    public int maxProduct(TreeNode root) {
        long total = dfs(root);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) continue;

            long cur = (total - node.val) * node.val;
            ans = Math.max(ans, cur);

            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        return (int)(ans % MOD);
    }

    public static void main(String[] args) {
        MaxProductOfBinaryTree solution = new MaxProductOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int result = solution.maxProduct(root); 
        System.out.println("Maximum product of splitted binary tree: " + result);
    }
}
