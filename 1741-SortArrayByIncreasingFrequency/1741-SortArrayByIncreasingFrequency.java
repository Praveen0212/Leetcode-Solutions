// Last updated: 8/12/2026, 9:07:18 AM
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if(fa != fb){
                return fa - fb;
            }
            return b - a;
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}