import java.util.ArrayList;
import java.util.List;

public class Solution448 {

    public static void main(String[] args) {
        List<Integer> numbers = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(numbers);

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        //使用哈希表导致了空间复杂度为O(n)，将nums数组作为哈希表
        int idx;
        for(int i=0;i<nums.length;i++){
            idx=(nums[i]-1)%nums.length;
            nums[idx]=nums[idx]+nums.length;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length){
                list.add(i+1);
            }

        }
        return list;
    }
}
