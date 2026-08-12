// Last updated: 8/12/2026, 9:09:09 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int arr[][] = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[j][i]=matrix[i][j];
            }
        }
        return arr;
    }
}