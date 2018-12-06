import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class BinaryTreeInorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        recursiveHelper(root, list);
        return list;
    }

    public void recursiveHelper(TreeNode root, ArrayList<Integer> list){
        if(root != null){
            if(root.left != null){
                recursiveHelper(root.left, list);
            }
            list.add(root.val);
            if(root.right != null){
                recursiveHelper(root.right, list);
            }
        }
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
}
