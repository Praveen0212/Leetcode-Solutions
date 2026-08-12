// Last updated: 8/12/2026, 9:07:14 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=0;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            r=Math.max(r,s);
        }
        return r;
    }
}