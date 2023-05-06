import java.util.PriorityQueue;

public class SolutionUnknown {
    public static void main(String[] args) {
        System.out.println(qurt(16));
    }

    private static boolean qurt(int x) {
        int left = 1, right = x / 2;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("left=" + left + "__" + "right=" + right + "__" + "mid=" + mid);
            if (mid > x / mid) {
                //mid*mid>x
                right = mid - 1;
            } else if (mid == x / mid) {
                return true;
            } else {
                left = mid + 1;
            }

        }

        return false;


    }
}
