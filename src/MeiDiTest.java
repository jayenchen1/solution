import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MeiDiTest {


        public static void main(String[] args) {
            test1();
        }

        static void swap(int[] nums,int i,int j){
            int temp;
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        static void test1(){
            Scanner in = new Scanner(System.in);
            List<Integer> list= new ArrayList<Integer>();
            String s = in.nextLine();
            String[] s1 = s.split(" ");
            int[] nums=new int[s1.length];
            for(int i=0;i<nums.length;i++){
                nums[i]=Integer.valueOf(s1[i]);
            }
            int minIdx=0;
            int maxIdx=0;
            for (int i = 0; i < nums.length; i++) {
                minIdx=nums[minIdx]>nums[i]?i:minIdx;
                maxIdx=nums[maxIdx]<nums[i]?i:maxIdx;
            }
            swap(nums,maxIdx,0);
            swap(nums,minIdx,nums.length-1);
            for (int num : nums) {
                System.out.print(num+" ");
            }
//
//            Integer min = list.get(minIdx);
//            Integer max = list.get(maxIdx);
//            Integer first=list.get(0);
//            Integer last=list.get(list.size()-1);
//            list.set(0,min);
//            list.set(list.size()-1,max);
//            list.set(minIdx,first);
//            list.set(maxIdx,last);
//            for (Integer i : list) {
//                System.out.print((i+0)+" ");
//            }

        }

        static void test2(){
//            Scanner in = new Scanner(System.in);
//            String s1 = in.next();
//            args = s1.split(",");
//            args=new String[]{"abc123","1","2.1"};
//            char[] chars = args[0].toCharArray();
//            StringBuilder sb=new StringBuilder();
//            for (char c : chars) {
//                if(c>='a'&&c<='z'){
//                    continue;
//                }
//                sb.append(c);
//            }
//            String s = sb.toString();
//            double r=Double.valueOf(s)+Double.valueOf(args[1])+Double.valueOf(args[2]);
//            System.out.println(r);
        }
       static void  test3(){
            Scanner in = new Scanner(System.in);
            String s1 = in.next();
            int pCount=0;
            int mCount=0;
            int sum=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='P'){
                    sum=(pCount++)>=3?sum+15:sum+10;
                }else if(s1.charAt(i)=='G'){
                    pCount=0;
                    sum+=5;
                }else{
                    pCount=0;
                    if((mCount++)==3){
                        break;
                    }
                }
            }
            System.out.println(sum);
        }
    
}
