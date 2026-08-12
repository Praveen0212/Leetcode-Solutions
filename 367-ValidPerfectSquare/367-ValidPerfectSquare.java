// Last updated: 8/12/2026, 9:11:34 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1;
        while(i*i<num){
            i++;
        }    
        return i*i==num;
    }
}