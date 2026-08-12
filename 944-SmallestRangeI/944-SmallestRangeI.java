// Last updated: 8/12/2026, 9:08:51 AM
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int dif = max - min - k*2;
        if(dif<0){
            return 0;
        }    
        return dif;
    }
}