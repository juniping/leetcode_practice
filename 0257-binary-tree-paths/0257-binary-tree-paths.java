/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        backTracking(root, new StringBuilder(), result);

        return result;
    }

    public void backTracking(TreeNode root, StringBuilder sb, List<String> result){
        if(root == null){
            return;
        }

        int length = sb.length();

        sb.append(root.val);

        if(root.left== null && root.right==null){
            result.add(sb.toString());
        }else{
            sb.append("->");
            backTracking(root.left, sb, result);
            backTracking(root.right, sb, result);
        }

        sb.setLength(length);
    }
}
