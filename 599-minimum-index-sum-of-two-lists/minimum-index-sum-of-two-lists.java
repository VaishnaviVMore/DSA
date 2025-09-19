class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> list=new ArrayList<>();
        //String[] arr=new String[];
        Map<String, Integer>map=new HashMap<>();
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int j=0;j<list2.length;j++){
            if(map.containsKey(list2[j])){
                int sum=map.get(list2[j])+j;
                if(sum<mini){
                    list.clear();
                    list.add(list2[j]);
                    mini=sum;
                }
                else if(sum==mini){
                    list.add(list2[j]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}