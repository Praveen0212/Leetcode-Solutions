// Last updated: 8/20/2026, 5:36:45 PM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        ArrayList<Integer> arr1 = new ArrayList<>();
4        ArrayList<Integer> arr2 = new ArrayList<>();
5        arr1.add(nums[0]);
6        arr2.add(nums[1]);
7        for(int i=2;i<nums.length;i++){
8            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
9                arr1.add(nums[i]);
10            }
11            else{
12                arr2.add(nums[i]);
13            }
14        } 
15        int a[] = new int[nums.length];
16        int index = 0;
17        for(int i=0;i<arr1.size();i++){
18            a[index] = arr1.get(i);
19            index++;
20        }
21        for(int i=0;i<arr2.size();i++){
22            a[index] = arr2.get(i);
23            index++;
24        } 
25        return a;  
26    }
27}