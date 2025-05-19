class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        
        for (int i = 0; i < len; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if left and right neighbors are empty or out of bounds
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant a flower
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        
        return count >= n;
    }
}
