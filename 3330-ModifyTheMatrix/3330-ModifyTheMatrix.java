// Last updated: 8/12/2026, 9:05:37 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int j=0;j<c;j++){
            int max = 0;
            for(int i=0;i<r;i++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
            for(int i=0;i<r;i++){
                if(matrix[i][j] == -1){
                    matrix[i][j]=max;
                }
            }
        }
        return matrix;    
    }
}