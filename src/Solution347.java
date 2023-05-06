import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution347 {
}
class SolutionIn347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }


        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((p1, p2)->p1[1]-p2[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new int[]{entry.getKey(),entry.getValue()});
            if(pq.size()>k){
                pq.remove();
            }
        }

        int len=pq.size();
        int[] res=new int[len];
        int j=0;
        for (int[] ints : pq) {
            res[j++]=ints[0];
        }
        return res;

    }
}