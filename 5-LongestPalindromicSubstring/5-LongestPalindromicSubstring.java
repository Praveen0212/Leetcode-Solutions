// Last updated: 8/12/2026, 9:17:20 AM
class Solution {
    public static int maxlength(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        if(s.isEmpty()) {
            return "";
        }
        int start = 0 , end = 0;
        for(int i=0;i<s.length();i++) {
            int len1 = maxlength(s,i,i);
            int len2 = maxlength(s,i,i+1);
            int maxi = Math.max(len1,len2);
            if(maxi > end-start+1) { 
                start = i - (maxi-1)/2;
                end = i + maxi/2;
            }
        }
        return s.substring(start,end+1);
    }
}