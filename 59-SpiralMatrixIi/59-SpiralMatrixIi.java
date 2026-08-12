// Last updated: 8/12/2026, 9:15:27 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int num = 1;
        while(left<=right && top <= bottom){
            for(int i=left;i<=right;i++){
                arr[top][i] = num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right] = num++;
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                    arr[bottom][i] = num++;
                }
                bottom--;
            }
            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                    arr[i][left] = num++;
                }
                left++;
            }
        }    
        return arr;
    }
}