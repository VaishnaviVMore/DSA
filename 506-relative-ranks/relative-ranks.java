class Solution {
    public String[] findRelativeRanks(int[] score) {
    int n = score.length;
        int[][] scoreIndexPairs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            scoreIndexPairs[i][0] = score[i];
            scoreIndexPairs[i][1] = i;
        }
        
        // Step 2: Sort the array of pairs by the score in descending order
        Arrays.sort(scoreIndexPairs, (a, b) -> b[0] - a[0]);
        
        // Step 3: Prepare an array to hold the ranks
        String[] ranks = new String[n];
        
        // Step 4: Define the special ranks for the top 3 positions
        String[] specialRanks = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        
        // Step 5: Assign ranks to the athletes based on their sorted positions
        for (int rank = 0; rank < n; rank++) {
            int index = scoreIndexPairs[rank][1];
            if (rank < 3) {
                // For the first three ranks, assign the special titles
                ranks[index] = specialRanks[rank];
            } else {
                // For other ranks, assign their position number as string (rank + 1 because rank is 0-based)
                ranks[index] = Integer.toString(rank + 1);
            }
        }
        
        // Step 6: Return the ranks array
        return ranks;
    }
}