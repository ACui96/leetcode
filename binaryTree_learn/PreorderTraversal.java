
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树前序遍历的迭代写法
 */
public class PreorderTraversal {

    public static void main(String[] args) {
        System.out.println("测试不会写。。。");
    }
    /**
     * 从根节点开始，每次迭代弹出当前栈顶元素，
     * 并将其孩子节点压入栈中，先压右孩子再压左孩子。
     * @param root
     * @return
     */
    public List<Integer> preorderTraversals(TreeNode root){
        LinkedList<TreeNode> stack  = new LinkedList<>();
        LinkedList<Integer> output  = new LinkedList<>();
       
        if(root == null){
            return output;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pollLast();
            output.add(treeNode.val);
            if(treeNode.right!=null){
                stack.add(treeNode.right);
            }
            if(treeNode.left != null){
                stack.add(treeNode.left);
            }
        }
        return output;
        }
}    
