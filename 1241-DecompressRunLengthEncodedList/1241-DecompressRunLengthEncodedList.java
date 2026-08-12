// Last updated: 8/12/2026, 9:08:29 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i=0;i<nums.length;i+=2){
            size += nums[i];
        }
        int arr[] = new int[size];
        int index = 0;
        for(int i=0;i<nums.length;i+=2){
            int f = nums[i];
            int v = nums[i+1];
            for(int j=0;j<f;j++){
                arr[index] = v;
                index++;
            }
        }
        return arr;
    }
}