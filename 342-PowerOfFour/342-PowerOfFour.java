// Last updated: 8/12/2026, 9:11:50 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }    
        while(n%4==0){
            n = n/4;
        }
        return n==1;
    }
}