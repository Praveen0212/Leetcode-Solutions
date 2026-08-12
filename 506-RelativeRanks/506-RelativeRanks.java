// Last updated: 8/12/2026, 9:10:32 AM
class Solution {
    public String[] findRelativeRanks(int[] score) {
            int n = score.length;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                list.add(score[i]);
            }
            Collections.sort(list);
            Collections.reverse(list);
           HashMap<Integer, String> map = new HashMap<>();
           for(int i=0;i<n;i++)
           {
            if(i==0)
            {
                    map.put(list.get(i),"Gold Medal");
            }
            else if(i==1)
            {
                map.put(list.get(i),"Silver Medal");
            }
            else if(i==2)
            {
                map.put(list.get(i),"Bronze Medal");
            }
            else
            {
                map.put(list.get(i),Integer.toString(i+1));
            }
            
           }
           String[] arr = new String[n];
           for(int i=0;i<n;i++)
           {
            arr[i] = map.get(score[i]);
           }
           return arr;
    }
}