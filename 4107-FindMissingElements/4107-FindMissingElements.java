// Last updated: 8/12/2026, 9:05:17 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;    
    }
}