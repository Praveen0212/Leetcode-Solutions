// Last updated: 8/12/2026, 9:12:15 AM
class Solution {
    public int addDigits(int num) {
        if(num<=0){
            return 0;
        }    
        while(num>=10){
            int sum = 0;
            while(num>0){
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}