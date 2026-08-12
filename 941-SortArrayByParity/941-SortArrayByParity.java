// Last updated: 8/12/2026, 9:08:54 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[] = new int[nums.length];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }
}