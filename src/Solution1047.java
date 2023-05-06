import java.util.ArrayDeque;

public class Solution1047 {
    public static void main(String[] args) {
        System.out.println(new SolutionIn1047().removeDuplicates("abbaca"));
    }
}
class SolutionIn1047 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> q=new ArrayDeque<Character>();
        char[] chs=s.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(q.size()!=0){
                char temp=q.getFirst().charValue();
                if(temp!=chs[i]){
                    q.addFirst(chs[i]);
                }else {
                    q.removeFirst();
//                    continue;
                }
            }else{
                q.addFirst(chs[i]);
            }
        }
        if(q.size()==0){
            return "";
        }


        int len=q.size();

        Character[] characters = q.toArray(new Character[len]);
        StringBuilder sb=new StringBuilder();
        for(int i=characters.length-1;i>=0;i--){
            sb.append(characters[i]);
        }
        return sb.toString();
//        return String.valueOf(chs);
    }
}
