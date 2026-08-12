// Last updated: 8/12/2026, 9:06:02 AM
class Solution {
    public int[] closestPrimes(int left, int right) {
        int arr[]=new int[right+1];
        for(int i=2;i*i<=right;i++){
            if(arr[i]==0){
                for(int j=i*i;j<=right;j+=i){
                    arr[j]=1;
                }
            }
        }
        int p=-1;
        int m=Integer.MAX_VALUE;
        int ans[]={-1,-1};
        for(int i=Math.max(2,left);i<=right;i++){
            if(arr[i]==0){
                if(p!=-1&&i-p<m){
                    m=i-p;
                    ans[0]=p;
                    ans[1]=i;
                }
                p=i;
            }
        }
        return ans;
    }
}