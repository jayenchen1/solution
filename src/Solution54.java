import java.util.ArrayList;
import java.util.List;

public class Solution54 {

    public static void main(String[] args) {
        List<Integer> list=new Solution().spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        list.forEach(i-> System.out.print(i+" "));
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;

        int i;
        int j;
        int startx=0;
        int starty=0;
        int offset=1;
        int shorter=m<n?m:n;


        int loop=shorter/2;
        while(loop!=0){
            i=startx;
            j=starty;

            for(;j<n-offset;j++){
                list.add(matrix[i][j]);
            }

            for(;i<m-offset;i++){
                list.add(matrix[i][j]);
            }

            for(;j>startx;j--){
                list.add(matrix[i][j]);
            }

            for(;i>starty;i--){
                list.add(matrix[i][j]);
            }

            startx++;
            starty++;
            offset++;
            loop--;
        }

        if(shorter%2==0){
            return list;
        }

        loop=shorter/2;
        if(m<n){
            for(int idx=loop;idx<n-loop;idx++){
                list.add(matrix[shorter/2][idx]);
            }
            return list;
        }

        for(int idx=loop;idx<n-loop;idx++){
            list.add(matrix[idx][shorter/2]);
        }

        return list;
    }


}