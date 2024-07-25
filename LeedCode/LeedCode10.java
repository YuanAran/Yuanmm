package leedcode;

import java.util.ArrayList;
import java.util.List;

public class LeedCode10 {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){return list;}
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
 class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
      }
 }
