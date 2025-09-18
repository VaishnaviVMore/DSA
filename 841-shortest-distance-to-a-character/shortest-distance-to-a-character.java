class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] leftmost=new int[n];
        int prev=-n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                prev=i;
            }
            leftmost[i]=i-prev;
        }
        int[] rightmost=new int[n];
        prev=2*n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                prev=i;
            }
            rightmost[i]=prev-i;
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.min(rightmost[i],leftmost[i]);
        }
        return ans;
    }
}