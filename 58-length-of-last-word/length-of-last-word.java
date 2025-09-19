class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split("\\s+");
        int n=str.length;
        int m=str[n-1].length();
        return m;
    }
}