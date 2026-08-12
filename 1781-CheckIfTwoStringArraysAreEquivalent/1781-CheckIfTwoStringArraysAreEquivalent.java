// Last updated: 8/12/2026, 9:07:17 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(int i=0;i<word1.length;i++){
            s1+=word1[i];
        }    
        for(int i=0;i<word2.length;i++){
            s2+=word2[i];
        }
        return s1.equals(s2);
    }
}