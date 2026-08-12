// Last updated: 8/12/2026, 9:08:44 AM
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==n-1 || i==0){
            return false;
        }
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
}