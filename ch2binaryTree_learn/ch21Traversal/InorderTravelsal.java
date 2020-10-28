package ch21Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acui
 */
public class InorderTravelsal {
    public List<Integer> inorderTravelsal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;

    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}
