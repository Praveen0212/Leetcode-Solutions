// Last updated: 8/12/2026, 9:14:58 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}