package ch21Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author acui
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode root;
    TreeNode(){}
    TreeNode(int val){ this.val=val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    List<TreeNode> datas;

    void create(Object[] objs) {
        datas = new ArrayList<TreeNode>();
        for (Object o:objs) {
            datas.add(new TreeNode(0));
        }
        root = datas.get(0);
        for (int i = 0; i < objs.length / 2; i++) {
            datas.get(i).left = datas.get(i * 2 + 1);
            if (i * 2 + 2 < datas.size()) {
                datas.get(i).right = datas.get(i * 2 + 2);
            }
        }
    }



}