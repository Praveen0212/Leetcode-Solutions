// Last updated: 8/12/2026, 9:09:54 AM
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int r = m;
        int c = n;
        for(int i=0;i<ops.length;i++){
            r = Math.min(r,ops[i][0]);
            c = Math.min(c,ops[i][1]);
        }
        return r*c;
    }
}