// Last updated: 8/12/2026, 9:12:12 AM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }    
        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        return n==1;
    }
}