class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int currsum=0;
        int count=0;
        for(int num:nums){
            currsum+=num;
            if(hm.containsKey(currsum-k)){
                count+=hm.get(currsum-k);
            }
            hm.put(currsum,hm.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}