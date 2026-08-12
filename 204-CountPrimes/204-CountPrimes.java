// Last updated: 8/12/2026, 9:12:59 AM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int arr[] = new int[n];
        for(int i=2;i*i<n;i++){
            if(arr[i]==0){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=1;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++){
            if(arr[i]==0){
                c++;
            }
        }
        return c;    
    }
}