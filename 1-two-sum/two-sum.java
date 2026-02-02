class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(hm.containsKey(rem)){
                arr[0]=i;
                arr[1]=hm.get(rem);
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}