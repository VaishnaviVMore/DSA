class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=s.length;
        int m=g.length;
        int l=0;int r=0;
        while(n>l && m>r){
            if(s[l]>=g[r]){
                l++;r++;
            }
            else{
                l++;
            }
        }
        return r;
    }
}