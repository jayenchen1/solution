import java.util.Arrays;
import java.util.List;

public class Order {
    public static void main(String[] args) {
        int[] ints = order2(new int[]{-1, 0, 1, 2, -1, -4});

        for(int i:ints){
            System.out.print(i+" ");
        }

    }



    //冒泡排序
    private static int[] order1(int[] nums){
//        for(int i=0;i<nums.length-1;i++){
//            int temp;
//            for(int j=0;j<nums.length-1-i;j++){
//                if(nums[j]>nums[j+1]){
//                    temp=nums[j+1];
//                    nums[j+1]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }return nums;
        for(int i=0;i<nums.length-1;i++){
//            int min=nums[i];
            int temp;
            for(int j=0;j<nums.length-i-1;j++){
              if(nums[j]>nums[j+1]){
                  temp=nums[j+1];
                  nums[j+1]=nums[j];
                  nums[j]=temp;
              }
            }
        }
        return nums;
    }

    //插入排序
    private static int[] order2(int[] nums){
//        for(int i=1;i<nums.length;i++){
//            int temp=nums[i];
//            for(int j=i;j>0;j--){
//                if(temp<nums[j-1]){
//                    nums[j]=nums[j-1];
//                    if(j==1){
//                        nums[0]=temp;
//                    }
//                }else{
//                    nums[j]=temp;
//                }
//            }
//        }
//        return nums;

        for(int i=0;i<nums.length-1;i++){
            int temp=nums[i+1];
            for(int j=i+1;j>0;j--){
                if(temp<nums[j-1]){
                    nums[j]=nums[j-1];
                    if(j==1){
                        nums[0]=temp;
                    }
                }else{
                    nums[j]=temp;
                    break;
                }
            }
        }

        return nums;
    }

    //选择排序
    private static int[] order3(int[] nums){

        for(int i=0;i<nums.length-1;i++){
            int maxIdx=0;
            for(int j=1;j<nums.length-i;j++){
                if(nums[maxIdx]<nums[j]){
                    maxIdx=j;
                }
                if(j==nums.length-i-1&&maxIdx!=j){
                    int temp=nums[j];
                    nums[j]=nums[maxIdx];
                    nums[maxIdx]=temp;
                }
            }
        }
        return nums;
    }

}
