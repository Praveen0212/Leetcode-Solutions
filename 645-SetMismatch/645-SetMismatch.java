// Last updated: 8/12/2026, 9:09:50 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int count[] = new int[n+1];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }    
        int d =0;
        int m =0;
        for(int i=1;i<=n;i++){
            if(count[i]==2){
                d=i;
            }
            if(count[i]==0){
                m=i;
            }
        }
        return new int[]{d,m};
    }
}