// Last updated: 8/12/2026, 9:08:15 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            map.put(num , map.getOrDefault(num , 0) + 1);
        }    
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList(map.values());
        for(int i=0;i<list.size();i++){
            int count = list.get(i);
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
}