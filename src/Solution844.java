public class Solution844 {
    public static void main(String[] args) {

        System.out.println(getString("xywrrmvv##p").equals(getString("xywrrmu#p")));
        System.out.println(getString("xywrrmp"));
        System.out.println(getString("xywrrmu#p"));

        //System.out.println("".equals(""));
    }
    public static String getString(String s){
        int leftIdx=0;
        char[] chars = new char[s.length()];
        if(s.length()==0){
            return "";
        }
        for (int rightIdx=0;rightIdx<s.length();rightIdx++){
            if (s.charAt(rightIdx)=='#'){
                if (leftIdx!=0){
                    chars[leftIdx--]=0;
                }
            }else{
                chars[leftIdx]=s.charAt(rightIdx);
                leftIdx++;
            }
        }
        if (leftIdx==0) return "";
        return String.valueOf(chars,0,leftIdx);
//        return String.valueOf(chars);这个方法里面的chars的长度会对返回的字符串有影响，比如说不同长度的chars返回来的字符型串用equals方法比较返回false
    }
}
