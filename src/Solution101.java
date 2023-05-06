

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution101 {
    static class TreeNode {
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

        static class Solution {
            public boolean isSymmetric(TreeNode root) {

                List<Integer> list = new ArrayList<Integer>();
                Stack<TreeNode> s = new Stack<TreeNode>();
                if (root == null) {
                    return true;
                }
                while (!s.empty() || root != null) {
                    if (root != null) {
                        s.push(root);
                        root = root.left;
                    } else {
                        root = s.pop();
                        list.add(root.val);
                        root = root.right;
                    }
                }

                int left = 0;
                int right = list.size() - 1;
                boolean r = true;
                while (left <= right && r) {
                    int num1 = list.get(left);
                    int num2 = list.get(right);
                    r = num1 == num2;
                    left++;
                    right--;
                }
                return r;
            }
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            TreeNode root = new TreeNode();
            root.val = 1;
            root.left = new TreeNode();
            root.left.val = 2;
            root.left.right = new TreeNode();
            root.left.right.val = 3;
            root.right = new TreeNode();
            root.right.val = 2;
            root.right.right = new TreeNode();
            root.right.right.val = 3;
            solution.isSymmetric(root);
        }
    }
}
