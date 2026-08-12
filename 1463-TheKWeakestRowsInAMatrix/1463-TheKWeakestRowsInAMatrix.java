// Last updated: 8/12/2026, 9:07:55 AM
class Solution {
    public int[] kWeakestRows(int[][] mat, int s) {
        int arr[] = new int[s];
        int pos = 0;
        for(int i=0;i<=mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                int count = 0;
                for(int k=0;k<mat[j].length;k++){
                    count += mat[j][k];
                }
                if(count == i){
                    arr[pos]=j;
                    pos++;
                    if(pos == s){
                        return arr;
                    }
                }
            }
        }
        return arr;    
    }
}