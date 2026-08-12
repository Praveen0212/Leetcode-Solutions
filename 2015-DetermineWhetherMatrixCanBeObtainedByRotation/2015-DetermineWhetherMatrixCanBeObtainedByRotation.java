// Last updated: 8/12/2026, 9:07:06 AM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int r=0;r<4;r++){
            boolean same = true;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]!=target[i][j]){
                        same = false;
                    }
                }
            }
            if(same){
                return true;
            }
            int arr[][] = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[j][n-1-i]=mat[i][j];
                }
            }
            mat = arr;
        }
        return false;
    }
}