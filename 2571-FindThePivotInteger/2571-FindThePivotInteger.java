// Last updated: 8/12/2026, 9:06:05 AM
class Solution {
    public int pivotInteger(int n) {
        int t = n*(n+1)/2;
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum==t-sum+i){
                return i;
            }
        }
        return -1;
    }
}