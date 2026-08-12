// Last updated: 8/12/2026, 9:14:46 AM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        int size = (int)Math.pow(2,n);
        for(int i=0;i<size;i++){
            list.add(i ^ (i/2));
        }
        return list;
    }
}