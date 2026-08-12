// Last updated: 8/12/2026, 9:15:32 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        int n = str.length-1;
        int x = str[n].length();
        return x;    
    }
}