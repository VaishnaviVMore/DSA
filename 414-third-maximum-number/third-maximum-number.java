class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num); // Remove duplicates
        }
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder()); // Sort descending
        
        if (list.size() >= 3) {
            return list.get(2); // Third maximum
        } else {
            return list.get(0); // Maximum
    }
}
}