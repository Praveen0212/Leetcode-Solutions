// Last updated: 8/12/2026, 9:17:13 AM
class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
            int digit =  x%10;
            rev = rev * 10 + digit;
            x/=10;
        }
        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 : (int) rev;
    }
}