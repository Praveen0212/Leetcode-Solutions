// Last updated: 8/12/2026, 9:13:55 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }    
        int ans = 0;
        for(int x : set){
            if(!set.contains(x-1)){
                int len = 1;
                while(set.contains(x+1)){
                    x++;
                    len++;
                }
                if(len>ans){
                    ans = len;
                }
            }
        }
        return ans;
    }
}