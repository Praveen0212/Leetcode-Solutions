// Last updated: 8/12/2026, 9:08:34 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int [nums.length];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            arr[index] = nums[i]*nums[i];
            index++;
        }  
        Arrays.sort(arr);
        return arr;  
    }
}