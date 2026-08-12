// Last updated: 8/12/2026, 9:09:35 AM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[t.length];

        for (int i = 0; i < t.length; i++) {
            while (!stack.isEmpty() && t[i] > t[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;        
    }
}