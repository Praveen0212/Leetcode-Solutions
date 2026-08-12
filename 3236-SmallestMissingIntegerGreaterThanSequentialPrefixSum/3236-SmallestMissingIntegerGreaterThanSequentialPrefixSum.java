// Last updated: 8/12/2026, 9:05:51 AM
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum += nums[i];
            }else{
                break;
            }
        }
        while(true){
            boolean ans = false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==sum){
                    ans = true;
                    break;
                }
            }
            if(!ans){
                return sum;
            }
            sum++;
        }    
    }
}