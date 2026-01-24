class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        ArrayList<int[]>result=new ArrayList<>();
        int[] newinterval=intervals[0];
        result.add(newinterval);
        for(int[] interval: intervals){
            if(interval[0]<=newinterval[1]){
                newinterval[1]=Math.max(interval[1],newinterval[1]);
            }
            else{
                newinterval=interval;
                result.add(newinterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}