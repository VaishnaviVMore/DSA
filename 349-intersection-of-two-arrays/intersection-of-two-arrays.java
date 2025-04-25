class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> Lt = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !Lt.contains(nums1[i])) {
                    Lt.add(nums1[i]);
                    break;
                }
            }
        }

        int[] result = new int[Lt.size()];
        for (int i = 0; i < Lt.size(); i++) {
            result[i] = Lt.get(i);
        }

        return result;
    }
}