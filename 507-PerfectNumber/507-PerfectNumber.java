// Last updated: 8/12/2026, 9:10:29 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }
        return false;    
    }
}