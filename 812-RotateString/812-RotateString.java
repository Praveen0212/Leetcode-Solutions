// Last updated: 8/12/2026, 9:09:20 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String str = s + s;
        return str.contains(goal);
    }
}