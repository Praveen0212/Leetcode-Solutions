// Last updated: 8/12/2026, 9:08:10 AM
class Solution {
    public boolean checkStraightLine(int[][] arr) {
        int x1 = arr[0][0];
        int y1 = arr[0][1];
        int x2 = arr[1][0];
        int y2 = arr[1][1];
        for(int i=2;i<arr.length;i++){
            int x = arr[i][0];
            int y = arr[i][1];
            if((y2-y1)*(x-x1) != (y-y1)*(x2-x1)){
                return false;
            }
        }
        return true;
    }
}