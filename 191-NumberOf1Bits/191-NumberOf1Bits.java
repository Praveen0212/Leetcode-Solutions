// Last updated: 8/12/2026, 9:13:08 AM
class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;    
    }
}