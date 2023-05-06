import commons.util.TreeNode;
import commons.util.TreeUtils;

import java.util.Stack;

public class Solution112 {
    public static void main(String[] args) {
        TreeNode root = TreeUtils.createTree("1,-2,-3,1,3,-2,null,-1");
        System.out.println(hasPathSum(root, 22));

    }
    //fail
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        boolean r=false;
        Stack<TreeNode> s=new Stack<TreeNode>();

        while((!s.empty()||root!=null)&&!r){
            if(root!=null){
                sum+=root.val;
                if(root.left==null&&root.right==null&&sum==targetSum){
                    r=true;
                }
                s.push(root);
                root=root.left;
            }else{
                root=s.pop();
                sum-=root.val;
                if(root.right!=null){
                    sum+=root.val;
                }
                root=root.right;
            }
        }

        return r;
    }
}
