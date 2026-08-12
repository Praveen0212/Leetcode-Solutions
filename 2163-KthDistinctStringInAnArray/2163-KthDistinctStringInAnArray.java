// Last updated: 8/12/2026, 9:06:43 AM
import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> mp = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for (String st : arr) {
            mp.put(st, mp.getOrDefault(st, 0) + 1);
        }
        for (String word : arr) {
            if (mp.get(word) == 1) {
                ans.add(word);
            }
        }
        if (k <= ans.size()) {
            return ans.get(k - 1);
        }
        return "";
    }
}