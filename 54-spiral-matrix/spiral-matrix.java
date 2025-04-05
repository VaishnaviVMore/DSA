class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
        //top
        for(int i=startcol;i<=endcol;i++){
            list.add(matrix[startrow][i]);
        }
        //rigth
        for(int j=startrow+1;j<=endrow;j++){
            list.add(matrix[j][endcol]);
        }
        //bottom
        for(int k=endcol-1;k>=startcol;k--){
            if(startrow==endrow){
                break;
            }
            list.add(matrix[endrow][k]);
        }
        //left
        for(int l=endrow-1;l>=startrow+1;l--){
            if(startcol==endcol){
                break;
            }
            list.add(matrix[l][startcol]);
         }
         startrow++;
         startcol++;
         endrow--;
         endcol--;
        }
        return list;
    }

}