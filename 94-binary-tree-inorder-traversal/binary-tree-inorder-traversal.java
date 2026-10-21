
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        if (root == null) {
            return arr;
        }

        arr.addAll(inorderTraversal(root.left));
        arr.add(root.val);
        arr.addAll(inorderTraversal(root.right));

        return arr;
    }
}
