import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n=2;
        System.out.println(grayCode(n));

    }

        public  static List<Integer> grayCode(int n) {
            if (n == 0) {
                List<Integer> base = new ArrayList<>();
                base.add(0);
                return base;
            }

            List<Integer> res = grayCode(n - 1);
            List<Integer> ans = new ArrayList<>(res);

            int mask = 1 << (n - 1);

            for (int i = res.size() - 1; i >= 0; i--) {
                ans.add(mask | res.get(i)); // Flip the (n-1)th bit and add to the list
            }

            return ans;
        }
    }

