// Last updated: 8/12/2026, 9:14:03 AM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex;
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<=n;i++){
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.add(1);
                }
                else{
                    ans.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            l.add(ans);
        }
        return l.get(n);    
    }
}