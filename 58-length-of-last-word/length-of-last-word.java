class Solution {
    public int lengthOfLastWord(String s) {
        //int n=s.length();
        String[] str=s.trim().split("\\s+");
        int n=str.length;
        return str[n-1].length();
    }
}