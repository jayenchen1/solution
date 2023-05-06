package commons.util;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeUtils {


    public static TreeNode createTree(String s){
        String[] ss = s.split(",");
        if(ss.length==0){
            return new TreeNode();
        }

        LinkedList<TreeNode> list=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.valueOf(ss[0]));
        list.add(root);
        int idx=1;
        TreeNode node;

        while(idx<ss.length){
            int length=list.size();
            for(int i=0;i<length;i++){
                node=list.get(i);
                node.left="null".equals(ss[idx])?null:new TreeNode(Integer.valueOf(ss[idx]));
                idx++;
                if(idx>=ss.length){
                    break;
                }
                node.right="null".equals(ss[idx])?null:new TreeNode(Integer.valueOf(ss[idx]));
                idx++;
                if(node.left!=null){
                    list.add(node.left);
                }
                if(node.right!=null){
                    list.add(node.right);
                }
            }

            while (length!=0){
                list.poll();
                length--;
            }
        }
        return root;
    }


}
