public class Solution904 {
    public static void main(String[] args) {
        System.out.println(new s().totalFruit(new int[]{0,1,6,6,4,4,6}));
    }
}
class s{
    public int totalFruit(int[] fruits) {

        if(fruits.length==1){
            return 1;
        }
        int left=0,right=0;

        for(int i=1;i<fruits.length;i++){
            if(fruits[i]!=fruits[left]){
                right=i;
                break;
            }
        }

        int finalCount=-1,currentCount=0;
        int RToNewR=0;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i]==fruits[left]||fruits[i]==fruits[right]){
                currentCount++;
            }else{
                finalCount=finalCount>currentCount?finalCount:currentCount;
                currentCount=i-right+1;
                left=right;
                right=i;

            }

        }
        return finalCount<currentCount?currentCount:finalCount;
    }
}