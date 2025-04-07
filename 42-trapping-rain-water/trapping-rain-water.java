class Solution {
    public int trap(int[] height) {
        int n=height.length;
        //left max bound array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //right max bound array
        int Rightmax[]=new int[n];
        Rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            Rightmax[i]=Math.max(height[i],Rightmax[i+1]);
        }
        //loop
        int trapwater=0;
        for(int i=0;i<n;i++){
            //waterlevel=min(max,min)
            int waterlevel=Math.min(leftmax[i],Rightmax[i]);
            //trappedwater=waterlevel-heights[i]
            trapwater+=waterlevel-height[i];
        }
        return trapwater;
    }
}