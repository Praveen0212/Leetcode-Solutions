// Last updated: 8/12/2026, 9:12:32 AM
class Solution {
    public int countDigitOne(int n) {
        long count = 0;
        for(long i=1;i<=n;i*=10){
            long a = n/i;
            long b = n%i;
            count += (a+8)/10*i;
            if(a%10==1){
                count += b+1;
            }
        }
        return (int) count;    
    }
}