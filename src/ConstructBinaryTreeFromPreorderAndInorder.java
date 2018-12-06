import java.util.Arrays;
import javafx.util.Pair;

public class ConstructBinaryTreeFromPreorderAndInorder {
    public Pair<TreeNode, int []> helper(int[] preorder, int[] inorder) {
        if (inorder.length == 0) {
            return new Pair(null, preorder);
        }

        // pick up the first element as a root
        int root_val = preorder[0];
        TreeNode root = new TreeNode(root_val);

        // find index of root in the inorder list
        int index = 0;
        for (; (index < inorder.length) && (inorder[index] != root_val); index++){}
        preorder = Arrays.copyOfRange(preorder, 1, preorder.length);

        // root splits inorder list
        // into left and right subtrees
        int [] left_inorder = Arrays.copyOfRange(inorder, 0, index);
        int [] right_inorder = index + 1 <= inorder.length ?
                Arrays.copyOfRange(inorder, index + 1, inorder.length) : new int [0];

        // recursion
        Pair<TreeNode, int []> p = helper(preorder, left_inorder);
        root.left = p.getKey();
        preorder = p.getValue();
        p = helper(preorder, right_inorder);
        root.right = p.getKey();
        preorder = p.getValue();

        return new Pair(root, preorder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Pair<TreeNode, int []> result = helper(preorder, inorder);
        return result.getKey();
    }

    //Definition for a binary tree node.
    public class TreeNode { int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
