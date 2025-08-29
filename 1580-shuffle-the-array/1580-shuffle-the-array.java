class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] shuffled = new int[nums.length];
       int left = 0;
       int right = n;

       for (int i = 0; i < nums.length; i++) {
        shuffled[i] = (i % 2 == 0) ? nums[left++] : nums[right++];
       }
       return shuffled;
    }
}