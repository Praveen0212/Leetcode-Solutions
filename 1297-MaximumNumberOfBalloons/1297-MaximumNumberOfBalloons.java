// Last updated: 8/12/2026, 9:08:18 AM
class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        for(int i = 0; i < text.length(); i++) {
            count[text.charAt(i) - 'a']++;
        }

        int b = count['b' - 'a'];
        int a = count['a' - 'a'];
        int l = count['l' - 'a'] / 2;
        int o = count['o' - 'a'] / 2;
        int n = count['n' - 'a'];

        return Math.min(b,
               Math.min(a,
               Math.min(l,
               Math.min(o, n))));
    }
}