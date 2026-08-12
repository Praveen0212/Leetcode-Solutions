// Last updated: 8/12/2026, 9:05:46 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int maxD = 0;
        int maxA = 0;
        for(int i=0;i<arr.length;i++){
            int length = arr[i][0];
            int width = arr[i][1];

            int diagonal = length * length + width * width;
            int area = length * width;

            if(diagonal > maxD){
                maxD = diagonal;
                maxA = area;
            } 
            else if(diagonal == maxD && area > maxA){
                maxA = area;
            }
        }
        return maxA;
    }
}