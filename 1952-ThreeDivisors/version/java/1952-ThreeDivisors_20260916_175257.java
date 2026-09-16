// Last updated: 9/16/2026, 5:52:57 PM
1class Solution {
2    public boolean isThree(int n) {
3        int count = 0;
4        for(int i=1;i<=n;i++){
5            if(n%i==0){
6                count++;
7            }
8        } 
9        return count == 3;   
10    }
11}