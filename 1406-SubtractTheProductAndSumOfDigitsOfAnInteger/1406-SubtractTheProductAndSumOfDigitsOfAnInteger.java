// Last updated: 8/12/2026, 9:08:03 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int result;
        int add = 0;
        int multiple = 1;
        while(n>0){
            int lastDigit = n % 10;
            n = n/10;
            add = add + lastDigit;
            multiple *= lastDigit;
        }
        result = multiple - add;
        return result;
    }
}