// Last updated: 8/12/2026, 9:09:45 AM
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                if(count>1){
                    return false;
                }
                else if(i>0 && nums[i-1]>nums[i+1]){
                    nums[i+1]=nums[i];
                }
                else{
                    nums[i]=nums[i+1];
                }
            }
        }
        return true;    
    }
}