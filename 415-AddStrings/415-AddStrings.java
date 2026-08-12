// Last updated: 8/12/2026, 9:10:59 AM
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder b = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int c = 0; 
        while(i>=0 || j>=0 || c>0){
            int sum = c;
            if(i>=0){
                sum += num1.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += num2.charAt(j) - '0';
                j--;
            }
            b.append(sum%10);
            c = sum / 10;
        }
        return b.reverse().toString();   
    }
}