import java.util.*;
class Solution {
    public void inorder(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr;
    }
}