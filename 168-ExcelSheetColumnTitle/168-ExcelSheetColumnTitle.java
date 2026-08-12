// Last updated: 8/12/2026, 9:13:23 AM
class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while(n>0){
            n--;
            s = (char)('A' + n%26) + s;
            n = n/26;
        } 
        return s;   
    }
}