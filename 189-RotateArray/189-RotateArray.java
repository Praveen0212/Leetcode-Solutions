// Last updated: 8/12/2026, 9:13:14 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        k = k % n;
        for(int i=0;i<n;i++){
            arr[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = arr[i];
        }    
    }
}