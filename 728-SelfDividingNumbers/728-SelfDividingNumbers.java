// Last updated: 8/12/2026, 9:09:38 AM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp = i;
            boolean isSelfDivision = true;
            while(temp>0){
                int digit = temp % 10;
                if(digit==0 || i%digit!=0){
                    isSelfDivision = false;
                    break;
                }
                temp /= 10;
            }
            if(isSelfDivision){
                res.add(i);
            }
        }
        return res;    
    }
}