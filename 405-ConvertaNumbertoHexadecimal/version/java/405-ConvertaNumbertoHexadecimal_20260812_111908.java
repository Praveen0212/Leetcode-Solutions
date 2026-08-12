// Last updated: 8/12/2026, 11:19:08 AM
1class Solution {
2    public String toHex(int num) {
3        if(num == 0){
4            return "0";
5        }
6        char hex[] = "0123456789abcdef".toCharArray();
7        String ans = "";
8        while(num!=0){
9            ans = hex[num & 15] + ans;
10            num = num >>> 4;
11        }
12        return ans;
13    }
14}