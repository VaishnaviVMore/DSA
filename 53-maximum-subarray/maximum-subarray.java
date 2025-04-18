class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;int maxsum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            currsum=currsum+nums[i];
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}