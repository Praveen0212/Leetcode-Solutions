// Last updated: 8/12/2026, 9:10:08 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            sum += nums[i];
        } 
        return sum;   
    }
}