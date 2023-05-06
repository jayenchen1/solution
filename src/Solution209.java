public class Solution209 {
    public static void main(String[] args) {
        System.out.println(new c2().minSubArrayLen(4,new int[]{1,4,4}));
    }

}

class c2 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum<target||nums==null){
            return 0;
        }

        int left=0,right=nums.length-1;
        while(left<=right){
            if(nums[left]<nums[right]){
                if(sum-nums[left]<target){
                    return right-left+1;
                }
                sum-=nums[left];
                left++;

            }else if(nums[left]>nums[right]){
                if(sum-nums[right]<target){
                    return right-left+1;
                }
                sum-=nums[right];
                right--;
            }else{
                int plusLeft=inside(sum-nums[left],left+1,right,nums,target);
                int subRight=inside(sum-nums[left],left,right-1,nums,target);
                return subRight<plusLeft?subRight:plusLeft;
            }
        }

        return 1;

    }
    public int inside(int sum,int left,int right,int[] nums,int target){



        if(sum<target){
            return right-left+1;
        }

        while(left<=right){
            if(nums[left]<nums[right]){
                if(sum-nums[left]<target){
                    return right-left+1;
                }
                sum-=nums[left];
                left++;
            }else if(nums[left]>nums[right]){
                if(sum-nums[right]<target){
                    return right-left+1;
                }
                sum-=nums[right];
                right--;
            }else{

                int plusLeft=inside(sum-nums[left],left+1,right,nums,target);
                int subRight=inside(sum-nums[left],left,right-1,nums,target);
                return subRight<plusLeft?subRight:plusLeft;
            }
        }
        return 1;
    }
}
