class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26]; // Assuming only lowercase English letters
        
        // Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }
        
        // Check if ransomNote can be formed
        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a'] == 0) {
                return false; // Not enough of character c
            }
            letters[c - 'a']--;
        }
        
        return true;
    }
}
