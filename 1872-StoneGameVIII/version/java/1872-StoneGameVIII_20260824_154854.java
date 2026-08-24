// Last updated: 8/24/2026, 3:48:54 PM
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3
4        int n = stones.length;
5
6        int[] sum = new int[n];
7        sum[0] = stones[0];
8
9        for (int i = 1; i < n; i++) {
10            sum[i] = sum[i - 1] + stones[i];
11        }
12
13        int ans = sum[n - 1];
14
15        for (int i = n - 2; i >= 1; i--) {
16            ans = Math.max(ans, sum[i] - ans);
17        }
18
19        return ans;
20    }
21}