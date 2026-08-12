// Last updated: 8/12/2026, 9:05:44 AM
import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Long> map = new HashMap<>();

        long sum = 0;
        long ans = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(nums[i] - k)) {
                ans = Math.max(ans, sum - map.get(nums[i] - k));
            }

            if (map.containsKey(nums[i] + k)) {
                ans = Math.max(ans, sum - map.get(nums[i] + k));
            }

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], sum - nums[i]);
            } else {
                map.put(nums[i], Math.min(map.get(nums[i]), sum - nums[i]));
            }
        }

        if (ans == Long.MIN_VALUE) {
            return 0;
        }

        return ans;
    }
}