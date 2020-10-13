import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    /**
    * 二叉树的前序遍历
    *https://leetcode-cn.com/problems/binary-tree-preorder-traversal/solution/leetcodesuan-fa-xiu-lian-dong-hua-yan-shi-xbian-2/
    */
    /**
     * 1.递归解法
     * @param root
     * @return void
     */
    public static void preorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        
        

    }
}