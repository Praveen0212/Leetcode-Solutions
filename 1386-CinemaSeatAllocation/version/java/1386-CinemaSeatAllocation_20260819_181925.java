// Last updated: 8/19/2026, 6:19:25 PM
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5
6        for (int[] seat : reservedSeats) {
7            map.putIfAbsent(seat[0], new HashSet<>());
8            map.get(seat[0]).add(seat[1]);
9        }
10
11        int ans = (n - map.size()) * 2;
12
13        for (int row : map.keySet()) {
14
15            boolean left = true;
16            boolean right = true;
17            boolean middle = true;
18
19            // 2,3,4,5
20            for (int i = 2; i <= 5; i++) {
21                if (map.get(row).contains(i)) {
22                    left = false;
23                }
24            }
25
26            // 6,7,8,9
27            for (int i = 6; i <= 9; i++) {
28                if (map.get(row).contains(i)) {
29                    right = false;
30                }
31            }
32
33            // 4,5,6,7
34            for (int i = 4; i <= 7; i++) {
35                if (map.get(row).contains(i)) {
36                    middle = false;
37                }
38            }
39
40            if (left && right) {
41                ans += 2;
42            }
43            else if (left || right || middle) {
44                ans += 1;
45            }
46        }
47
48        return ans;
49    }
50}