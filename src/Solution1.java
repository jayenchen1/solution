import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        int idx[]=getIndexs(new int[]{1,2,6,3,8,8,9,10,15,18},30);
        if (idx!=null){
            for (int i = 0; i < idx.length; i++) {
                System.out.print(idx[i]+",");
            }
        }else{
            System.out.println();
            System.out.println("G!~~~");
        }

    }

    private static int[] getIndexs(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
