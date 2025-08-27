class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int currlen=1;
        int maxlen=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                currlen++;
            }
            else{
                currlen=1;
            }
            maxlen=Math.max(currlen,maxlen);
        }
        return maxlen;
    }
}