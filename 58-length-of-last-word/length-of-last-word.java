class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        int n=str.length;
        String ls=str[n-1];
        return ls.length();
    }
}