package goit.task5_3;


public class BSTSearch {
    public boolean exist(TreeNode root, int target) {
        if (root == null) return false;

        if (target == root.value) return true;

        if (target > root.value) return exist(root.right, target);
        else return exist(root.left, target);
    }
}
