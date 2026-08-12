// Last updated: 8/12/2026, 9:14:56 AM
class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int z = 0;
        int o = 0;
        int t = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        } 
        int index = 0;
        while(z-- > 0){
            nums[index++] = 0;
        }
        while(o-- > 0){
            nums[index++] = 1;
        }
        while(t-- > 0){
            nums[index++] = 2;
        }   
    }
}