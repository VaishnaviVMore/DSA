class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long totalCoins = mid * (mid + 1) /2; 
            // Sum of first `mid` rows
            
            if (totalCoins == n) {
                return (int) mid;
            } else if (totalCoins < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right;
    }
}