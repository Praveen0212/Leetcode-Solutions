// Last updated: 8/12/2026, 9:06:20 AM
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return '0'; 
    }
}