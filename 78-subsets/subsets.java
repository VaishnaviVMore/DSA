class Solution {
    public void helper(int[] nums, int ind,List<Integer>sub,List<List<Integer>>list){
        int n=nums.length;
        if(ind==n){
            list.add(new ArrayList<>(sub));
            return;
        }
        //include
        sub.add(nums[ind]);
        helper(nums,ind+1,sub,list);
        sub.remove(sub.size()-1);
        //exclude
        helper(nums,ind+1,sub,list);
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>>list=new ArrayList<>();
        //List<Integer>sub=new ArrayList<>();
        helper(nums,0,new ArrayList<>(),list);
        return list;
        // list.add(new ArrayList<>());
        // for(int num :nums){
        //     int n=list.size();
        //     for(int i=0;i<n;i++){
        //         list
        //     }
        // }
        
        //if()
    }
}