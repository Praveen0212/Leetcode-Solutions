// Last updated: 8/12/2026, 9:08:40 AM
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=2;i<=n;i++){
           int temp = a+b;
           a = b;
           b = temp; 
        }
        return b;    
    }
}