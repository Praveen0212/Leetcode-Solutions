// Last updated: 8/12/2026, 9:13:47 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;    
    }
}