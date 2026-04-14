import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            map.putIfAbsent(nums[i], new ArrayList<>());

            List<Integer> list = map.get(nums[i]);
            list.add(i);

            if (list.size() >= 3) {
                int size = list.size();
                int idx1 = list.get(size - 3);
                int idx3 = list.get(size - 1);

                ans = Math.min(ans, 2 * (idx3 - idx1));
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}