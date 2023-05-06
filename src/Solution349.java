import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution349 {
}

class SolutionIn349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        int nums1Len=nums1.length;
        Set<Integer> set =new HashSet<Integer>(nums1Len);
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums1Len;i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}