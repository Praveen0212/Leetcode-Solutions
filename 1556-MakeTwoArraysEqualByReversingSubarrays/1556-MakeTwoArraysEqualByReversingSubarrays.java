// Last updated: 8/12/2026, 9:07:33 AM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<target.length;i++){
            if(target[i]!=arr[i])
                return false;
        }
        return true;    
    }
}