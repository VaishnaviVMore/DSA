class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char so[]=s.toCharArray();
        char to[]=t.toCharArray();
        Arrays.sort(so);
        Arrays.sort(to);
        return Arrays.equals(so,to);
    }
}