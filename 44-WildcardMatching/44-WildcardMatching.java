// Last updated: 8/12/2026, 9:15:54 AM
class Solution {
    public static boolean isMatch(String s, String p) {
        int i = 0;  // Pointer for string s
        int j = 0;  // Pointer for pattern p
        int n = s.length();
        int m = p.length();

        // Base case: both strings empty
        if (n == 0 && m == 0) {
            return true;
        }

        int laststar = -1;    // Position of last '*'
        int lastmatch = 0;    // Position in s where last '*' tried to match

        // Traverse the string s
        while (i < n) {
            // Case 1: Exact match or '?'
            if (j < m && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
                i++;
                j++;
            }
            // Case 2: Pattern has '*'
            else if (j < m && p.charAt(j) == '*') {
                laststar = j;         // Remember star position
                lastmatch = i;        // Remember match position in s
                j++;                  // Move pattern forward
            }
            // Case 3: Mismatch but we saw a previous '*'
            else if (laststar != -1) {
                j = laststar + 1;     // Reset j to just after '*'
                lastmatch++;          // Try to match one more char with '*'
                i = lastmatch;        // Move i accordingly
            }
            // Case 4: Mismatch and no previous '*'
            else {
                return false;
            }
        }

        // If remaining pattern has stars, skip them
        while (j < m && p.charAt(j) == '*') {
            j++;
        }

        // If we reached the end of pattern, it's a match
        return j == m;
    }
}