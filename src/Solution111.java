public class Solution111 {
     class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
    class Solution {
        public int minDepth(TreeNode root) {
            if(root.left!=null&&root.right!=null){
                return getMinHeight(root,1);
            }else if(root.left==null&&root.right!=null){
                return getMinHeight(root.right,2);
            }else{
                return getMinHeight(root.left,2);
            }

        }

        public int getMinHeight(TreeNode root,int curHeight){
            if(root==null){
                return curHeight-1;
            }

            int left=getMinHeight(root.left,curHeight+1);
            int right= getMinHeight(root.right,curHeight+1);

            return Math.min(left,right);
        }
    }

    public static void main(String[] args) {

    }
}
