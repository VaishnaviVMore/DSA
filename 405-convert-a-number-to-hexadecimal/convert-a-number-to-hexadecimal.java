class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        // Process 32 bits in 4-bit chunks (total 8 times)
        while (num != 0 && sb.length() < 8) {
            int hexDigit = num & 0xf; // Extract last 4 bits
            sb.append(hexChars[hexDigit]);
            num >>>= 4; // Logical right shift (unsigned)
        }

        return sb.reverse().toString();
    }
}