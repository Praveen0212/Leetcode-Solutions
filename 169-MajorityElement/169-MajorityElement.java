// Last updated: 8/12/2026, 9:13:19 AM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];    
    }
}