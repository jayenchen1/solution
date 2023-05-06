public class Solution98 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


        private static int preVal = Integer.MIN_VALUE;


        public static boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }

            boolean isBst = isValidBST(root.left);
            if (!isBst) {
                return false;
            }
            if (root.val <= preVal) {
                return false;
            } else {
                preVal = root.val;
            }
            return isValidBST(root.right);
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode();
            System.out.println(isValidBST(root));
        }
    }
}



