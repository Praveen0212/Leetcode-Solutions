// Last updated: 8/12/2026, 9:05:59 AM
class Solution {
    public int matrixSum(int[][] nums) {
        int r = nums.length;
        int c = nums[0].length;
        for(int i = 0; i < r; i++) {
            Arrays.sort(nums[i]);
        }
        int sum = 0;
        for(int j = 0; j < c; j++) {
            int max = 0;
            for(int k = 0; k < r; k++) {
                max = Math.max(max, nums[k][j]);
            }
            sum += max;
        }
        return sum;
    }
}