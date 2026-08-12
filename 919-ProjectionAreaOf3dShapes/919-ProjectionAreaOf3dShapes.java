// Last updated: 8/12/2026, 9:09:02 AM
class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0;
        int f = 0;
        int s = 0;
        for(int i=0;i<n;i++){
            int r = 0;
            int c = 0;
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    top++;
                }
                r = Math.max(r,grid[i][j]);
                c = Math.max(c,grid[j][i]);
            }
            f += r;
            s += c;
        }
        return f+top+s;    
    }
}