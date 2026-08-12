// Last updated: 8/12/2026, 9:10:33 AM
class Solution {
    public String[] findWords(String[] words) {
        ArrayList <String> list = new ArrayList<>();
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        for(String word : words){
            String s = word.toLowerCase();
            String row = "";
            if(a.indexOf(s.charAt(0)) >=0){
                row = a;
            }
            else if(b.indexOf(s.charAt(0))>=0){
                row = b;
            }
            else{
                row = c;
            }
            boolean ans = true;
            for(int i=0;i<s.length();i++){
                if(row.indexOf(s.charAt(i))== -1){
                    ans = false;
                    break;
                }
            }
            if(ans){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}