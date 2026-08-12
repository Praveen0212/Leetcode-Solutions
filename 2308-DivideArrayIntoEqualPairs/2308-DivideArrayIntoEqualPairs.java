// Last updated: 8/12/2026, 9:06:32 AM
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        
        for (int count : counter.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}