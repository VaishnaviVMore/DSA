class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>Hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(Hm.containsKey(nums[i])){
                Hm.put(nums[i],Hm.get(nums[i])+1);
            }
            else{
                Hm.put(nums[i],1);
            }
            if(Hm.get(nums[i])>1){
                return nums[i];
            }
        }
        return -1;

    }
}