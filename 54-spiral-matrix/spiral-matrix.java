class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        ArrayList<Integer>list=new ArrayList<>();
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                list.add(matrix[startrow][i]);
            }
            //right
            for(int j=startrow+1;j<=endrow;j++){
                list.add(matrix[j][endcol]);
            }
            //bottom
            if(startrow < endrow){
                 for(int k=endcol-1;k>=startcol;k--){
                list.add(matrix[endrow][k]);
            }
            }
           
            //left
            if(startcol < endcol){
                for(int l=endrow-1;l>=startcol+1;l--){
                list.add(matrix[l][startrow]);
            }
            }
            startrow++;startcol++;endrow--;endcol--;
        }
        return list;
    }
}