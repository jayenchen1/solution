import commons.util.TreeNode;

public class Solution106 {
    static  int[] inorder;
    static int[] postorder;

    public static TreeNode buildTree(int[] in, int[] post) {
        inorder=in;
        postorder=post;
        return  rebuild(0,inorder.length-1,0,postorder.length-1);
    }

    public static TreeNode rebuild(int inLeft,int inRight,int postLeft,int postRight){
        if(inLeft==inRight){
            return new TreeNode(inorder[inLeft]);
        }
        if(inRight<inLeft){
            return null;
        }

        int inorderMidNodeIdx=0;
        for(int i=inLeft;i<=inRight;i++){
            if(inorder[i]==postorder[postRight]){
                inorderMidNodeIdx=i;
                break;
            }
        }

        TreeNode root=new TreeNode(inorder[inorderMidNodeIdx]);

        TreeNode left=rebuild(inLeft,inorderMidNodeIdx-1,postLeft,postLeft+inorderMidNodeIdx-inLeft-1);

        TreeNode right=rebuild(inorderMidNodeIdx+1,inRight, postRight-(inorderMidNodeIdx-inLeft),postRight-1);

        root.left=left;
        root.right=right;
        return root;
    }
//    public static TreeNode rebuild(int[] inorder,int inLeft,int inRight,int[] postorder,int postLeft,int postRight){
//        if(inLeft==inRight){
//            return new TreeNode(inorder[inLeft]);
//        }
//
//        int inorderMidNodeIdx=0;
//        for(int i=inLeft;i<=inRight;i++){
//            if(inorder[i]==postorder[postRight]){
//                inorderMidNodeIdx=i;
//                break;
//            }
//        }
//
//        TreeNode root=new TreeNode(inorder[inorderMidNodeIdx]);
//
//        TreeNode left=rebuild(inorder,inLeft,inorderMidNodeIdx-1,
//                postorder,postLeft,postLeft+inorderMidNodeIdx-inLeft-1);
//
//        TreeNode right=rebuild(inorder,inorderMidNodeIdx+1,inRight,
//                postorder,postRight-(inorderMidNodeIdx-inLeft),postRight-1);
//
//        root.left=left;
//        root.right=right;
//        return root;
//    }

    public static void main(String[] args) {
        TreeNode treeNode = buildTree(new int[]{2,1}, new int[]{2,1});

    }
}
