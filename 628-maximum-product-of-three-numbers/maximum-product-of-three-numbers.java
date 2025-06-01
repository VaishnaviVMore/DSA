class Solution {
    public int maximumProduct(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        
        // Maximum product can be either the product of the top three numbers
        // or the product of the two smallest numbers (if negative) and the largest number
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);
    }
}