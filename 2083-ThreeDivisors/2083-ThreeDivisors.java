// Last updated: 8/12/2026, 9:06:56 AM
class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        } 
        return count == 3;   
    }
}