class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length();
        int result=0;
        for(int i=0;i<n;i++){
            char c=columnTitle.charAt(i);
            int value=c-'A'+1;
            result=result*26+value;
        }
        return result;
    }
}