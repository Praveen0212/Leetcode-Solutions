// Last updated: 8/12/2026, 9:15:24 AM
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> num = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<n;i++){
            fact *= i;
        }    
        for(int i=1;i<=n;i++){
            num.add(i);
        }
        k--;
        StringBuilder ans = new StringBuilder();
        while(!num.isEmpty()){
            int index = k/fact;
            ans.append(num.get(index));
            num.remove(index);
            if(num.isEmpty()){
                break;
            }
            k=k%fact;
            fact = fact / num.size();
        }
        return ans.toString();
    }
}