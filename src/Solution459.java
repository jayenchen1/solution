import java.util.Arrays;

public class Solution459 {
    public static void main(String[] args) {
        System.out.println(new SolutionIn459().repeatedSubstringPattern("abababaaba"));
    }
}
class SolutionIn459 {
    public boolean repeatedSubstringPattern(String s) {

        if(s.length()==0){
            return false;
        }
        int[] next=new int[s.length()];
        getNext(next,s);
        System.out.println(Arrays.toString(next));

        int sLen=s.length();

        if(next[sLen-1]!=0&&sLen%(sLen-next[sLen-1])==0){
            return true;
        }

        return false;

    }

    public void getNext(int[] next,String s){
        int j=0;
        next[0]=0;
        for(int i=1;i<next.length;i++){
            while(j>0&&s.charAt(j)!=s.charAt(i)){
                j=next[j-1];
            }
            if((s.charAt(j)==s.charAt(i))){
                j++;
            }
            next[i]=j;
        }
    }
}