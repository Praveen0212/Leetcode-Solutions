// Last updated: 8/12/2026, 9:06:30 AM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int num=0;num<=1000;num++){
            int count = 0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[i].length;j++){
                    if(nums[i][j]==num){
                        count++;
                        break;
                    }
                }
            }
            if(count==nums.length){
                ans.add(num);
            }
        }    
        return ans;
    }
}