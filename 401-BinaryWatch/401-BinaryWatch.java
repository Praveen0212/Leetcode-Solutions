// Last updated: 8/12/2026, 9:11:15 AM
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j) == turnedOn){
                    if(j<10){
                        ans.add(i+":0"+j);
                    }
                    else{
                        ans.add(i+":"+j);
                    }
                }
            }
        } 
        return ans;   
    }
}