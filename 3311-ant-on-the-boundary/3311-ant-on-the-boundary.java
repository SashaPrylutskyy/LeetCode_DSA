class Solution {
    public int returnToBoundaryCount(int[] nums) {
       int count = 0;
       int boundaries = 0;
       for (int num : nums) {
        count += num;
        if (count == 0) {
            boundaries++;
        }
       } 
       return boundaries;
    }
}