class Solution {
    public boolean isBoomerang(int[][] points) {
          int[] A = points[0];
        int[] B = points[1];
        int[] C = points[2];

        // Check if any two points are the same
        if ((A[0] == B[0] && A[1] == B[1]) || 
            (A[0] == C[0] && A[1] == C[1]) || 
            (B[0] == C[0] && B[1] == C[1])) {
            return false;
        }

        // Check if the points are collinear
        return (B[0] - A[0]) * (C[1] - A[1]) != 
               (B[1] - A[1]) * (C[0] - A[0]);
    }
}