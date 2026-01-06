// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/?envType=daily-question&envId=2026-01-06

import java.util.ArrayList;
import java.util.List;

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
//       }
// }
 

class MaxLevelSumTree{
    public void dfs(TreeNode node, int level, List<Integer> sumOfNodesAtLevel){
        if(node == null){
            return;
        }

        if(sumOfNodesAtLevel.size() == level){
            sumOfNodesAtLevel.add(node.val);
        }
        else{
            sumOfNodesAtLevel.set(level, sumOfNodesAtLevel.get(level) + node.val);
        }

        dfs(node.left, level + 1, sumOfNodesAtLevel);
        dfs(node.right, level + 1, sumOfNodesAtLevel);
    }
    
    public int maxLevelSum(TreeNode root) {
        List<Integer> sumOfNodesAtLevel = new ArrayList<>();
        dfs(root, 0, sumOfNodesAtLevel);

        int maxSum = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < sumOfNodesAtLevel.size(); i++){
            if(maxSum < sumOfNodesAtLevel.get(i)){
                maxSum = sumOfNodesAtLevel.get(i);
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxLevelSumTree solution = new MaxLevelSumTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        int result = solution.maxLevelSum(null); 
        System.out.println("Level with maximum sum: " + result);
    }
}