// Last updated: 8/12/2026, 9:05:48 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        int max = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        int sum = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==max){
                sum += list.get(i);
            }
        }
        return sum;
    }
}