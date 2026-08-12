// Last updated: 8/12/2026, 9:09:58 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> can=new HashSet<>();
        int candy=candyType.length/2;
        for(int i=0;i<candyType.length;i++){
            can.add(candyType[i]);
        }
        return Math.min(can.size(),candy);
    }
}