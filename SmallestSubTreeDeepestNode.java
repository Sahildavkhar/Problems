// https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/description/?envType=daily-question&envId=2026-01-09

class Result{
    TreeNode node;
    int dist;
    Result(TreeNode n, int d){
        node = n;
        dist = d;
    }
}

public class SmallestSubTreeDeepestNode {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    public Result dfs(TreeNode node){
        if(node == null){
            return new Result(null, 0);
        }
        Result L = dfs(node.left), R = dfs(node.right);
        if(L.dist > R.dist){
            return new Result(L.node, L.dist + 1);
        }
        if(L.dist < R.dist){
            return new Result(R.node, R.dist + 1);
        }
        return new Result(node, L.dist + 1);
    }

    public static void main(String[] args) {
        SmallestSubTreeDeepestNode solution = new SmallestSubTreeDeepestNode();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode result = solution.subtreeWithAllDeepest(root);
        System.out.println("The value of the smallest subtree containing all the deepest nodes: " + result.val);
    }
}
