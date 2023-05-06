public class Solution297 {
  static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

       public TreeNode() {
       }

       public TreeNode(TreeNode right) {
           this.right = right;
       }

       public int getVal() {
           return val;
       }

       public void setVal(int val) {
           this.val = val;
       }

       public TreeNode getLeft() {
           return left;
       }

       public void setLeft(TreeNode left) {
           this.left = left;
       }

       public TreeNode getRight() {
           return right;
       }

       public void setRight(TreeNode right) {
           this.right = right;
       }
   }


    public static class Codec {

         int i=0;
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb=new StringBuilder();
            preOrderSer(root,sb);
            return sb.toString();
        }

        public void preOrderSer(TreeNode root,StringBuilder sb){
            if(root==null){
                sb.append("#_");
                return;
            }
            sb.append(root.val+"_");

            preOrderSer(root.left,sb);
            preOrderSer(root.right,sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] sts=data.split("_");
            TreeNode root=create(sts,i);
            return root;
        }

        public TreeNode create(String[] str,int i){
            if(str[i].equals("#")){
                i++;
                return null;
            }
            TreeNode root=new TreeNode();
            root.val=Integer.valueOf(str[i++]);
            TreeNode left=create(str,i);
            TreeNode right=create(str,i);
            root.left=left;
            root.right=right;

            return root;
        }
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.right.left=new TreeNode(4);
        node.right.right=new TreeNode(5);

        Codec codec = new Codec();
        String serialize = codec.serialize(node);
        System.out.println(serialize);

        TreeNode deserialize = codec.deserialize(serialize);
//            commons.util.TreeNode root=new commons.util.TreeNode(1);
//            root.left=new commons.util.TreeNode();
//            test(root.left);
    }
    static void test(TreeNode root){
      root=null;
    }
}
