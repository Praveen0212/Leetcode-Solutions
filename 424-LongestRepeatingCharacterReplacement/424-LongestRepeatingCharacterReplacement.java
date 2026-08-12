// Last updated: 8/12/2026, 9:10:55 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0;
            int replace = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != c) {
                    replace++;
                }
                while (replace > k) {
                    if (s.charAt(i) != c) {
                        replace--;
                    }

                    i++;
                }
                ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}