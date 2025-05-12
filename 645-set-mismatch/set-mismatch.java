import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        Set<Integer> seen = new HashSet<>();
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;

        for (int num : nums) {
            if (seen.contains(num)) {
                ans[0] = num; // duplicate
            } else {
                seen.add(num);
                actualSum += num;
            }
        }

        ans[1] = expectedSum - actualSum; // missing
        return ans;
    }
}
