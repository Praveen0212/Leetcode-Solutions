// Last updated: 8/12/2026, 9:10:02 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }    
        int k = 0;
        int arr[][] = new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[k/c][k%c] = mat[i][j];
                k++;
            }
        }
        return arr;
    }
}