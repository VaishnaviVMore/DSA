class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-based index
            char letter = (char) ('A' + (columnNumber % 26)); // Get the corresponding letter
            result.insert(0, letter); // Insert at the beginning
            columnNumber /= 26; // Move to the next column
        }

        return result.toString();
    }
}