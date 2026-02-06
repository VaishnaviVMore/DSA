class Solution {
    public boolean isAnagram(String s, String t) {
        String[] ch1=s.split("");
        String[] ch2=t.split("");
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}