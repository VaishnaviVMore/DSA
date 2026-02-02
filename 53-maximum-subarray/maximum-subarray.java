class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int cs=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            cs+=nums[i];
             maxi=Math.max(cs,maxi);
            if(cs<0){
                cs=0;
            }
        }
        return maxi;
    }
}