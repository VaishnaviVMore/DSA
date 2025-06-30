class Solution {
    public int sumDigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sumDigit(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}