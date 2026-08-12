// Last updated: 8/12/2026, 9:10:52 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int arr[] = new int[nums.length + 1];
        List<Integer> ans = new ArrayList<>();
        for(int n: nums){
            arr[n]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}