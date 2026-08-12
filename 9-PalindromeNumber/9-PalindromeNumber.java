// Last updated: 8/12/2026, 9:17:08 AM
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int num = x;
        while(num>0){
            int d = num%10;
            rev = rev * 10 + d;
            num = num/10;
        }
        if(rev != x){
            return false;
        }
        else{
            return true;
        }
    }
}