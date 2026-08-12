// Last updated: 8/12/2026, 9:06:49 AM
class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(a>nums[i]){
                a = nums[i];
            }
        }
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if(b<nums[i]){
                b=nums[i];
            }
        }
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
        }    
        return a;
    }
}