// Last updated: 8/12/2026, 9:13:05 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        int ans = 0;
        for (int i = 2; i < n; i++) {
            ans = Math.max(first + nums[i], second);
            first = second;
            second = ans;
        }
        return ans;
    }
}