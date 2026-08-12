// Last updated: 8/12/2026, 9:10:15 AM
class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder temp = new StringBuilder(arr[i]);
            ans.append(temp.reverse());
            if(i != arr.length-1){
                ans.append(" ");
            }
        }    
        return ans.toString();
    }
}