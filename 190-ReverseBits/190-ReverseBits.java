// Last updated: 8/12/2026, 9:13:11 AM
class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0;i<32;i++){
            res = res * 2 + (n%2);
            n = n / 2;
        } 
        return res;   
    }
}