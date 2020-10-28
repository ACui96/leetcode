package ch21Traversal;

import java.util.*;

public class PostTraversal {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t = new TreeNode();
        Object[] a = {1, null, 2, 3};
        t.create(a);
        s.postorderTraversal(t);
    }

    static class Solution{
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            if (root == null) {
                return res;
            }

            Deque<TreeNode> stack = new LinkedList<TreeNode>();
            TreeNode prev = null;
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (root.right == null || root.left == prev) {
                    res.add(root.val);
                    prev = root;
                    root = null;
                } else {
                    stack.push(root);
                    root = root.right;

                }

            }
            return res;
        }
    }
}
