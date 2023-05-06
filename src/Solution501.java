import commons.util.TreeNode;
import commons.util.TreeUtils;

import java.util.*;

public class Solution501 {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.createTree("1,null,2");
        int[] mode = new Solution().findMode(root);
    }
    static  class Solution {
        public static int[] findMode(TreeNode root) {
            if (root == null) {
                return new int[]{};
            }

            check(root);

            int length = list.size();
            int[] r = new int[length];

            for (int i = 0; i < length; i++) {
                r[i] = list.get(i);
            }
            return r;

        }

        static int maxCount = 0;
        static int totalCount = 0;
        static TreeNode pre;
        static LinkedList<Integer> list = new LinkedList<Integer>();

        public static void check(TreeNode root) {
            if(root==null){
                return;
            }

            check(root.left);
            if(pre==null||pre.val!=root.val){
                totalCount=1;
            }else {
                totalCount++;
            }

            if(totalCount>maxCount){
                list.clear();
                list.add(root.val);
            }else if(totalCount==maxCount){
                list.add(root.val);
            }
            pre=root;

            check(root.right);

        }
    }

//    static class Solution {
//
//
//        // LinkedList<TreeNode> list=new LinkedList<TreeNode>();
//       static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//        public static void check(TreeNode root){
//            if(root==null){
//                return;
//            }
//            // if()
//            check(root.left);
//            // list.add(root);
//            if(map.containsKey(root.val)){
//                map.put(root.val, map.get(root.val)+1);
//            }else{
//                map.put(root.val,1);
//            }
//            check(root.right);
//
//        }
//        public static int[] findMode(TreeNode root) {
//            check(root);
//            PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<Map.Entry<Integer,Integer>>((r1,r2)->r1.getValue()-r2.getValue());
//
//            for(Map.Entry<Integer,Integer> e:map.entrySet()){
//                queue.add(e);
//            }
//
//            ArrayList<Integer> list=new ArrayList<>();
//            Map.Entry<Integer,Integer> preNode=queue.remove();
//            int preKey=preNode.getKey();
//            int preValue=preNode.getValue();
//            list.add(preKey);
//            list.add(preKey);
//            while(!queue.isEmpty()){
//                preNode=queue.remove();
//                if((preNode.getValue()==preValue)){
//                    list.add(preNode.getKey());
//                }else{
//                    break;
//                }
//            }
//
//            int length=list.size();
//            int[] r=new int[length];
//            for(int i=0;i<length;i++){
//                r[i]=list.get(i);
//            }
//
//            return r;
//        }
//
//    }

}
