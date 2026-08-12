// Last updated: 8/12/2026, 9:15:11 AM
class Solution {
    public int mySqrt(int x) {

        int i = 0;

        while ((long)i * i <= x) {
            i++;
        }

        return i - 1;
    }
}