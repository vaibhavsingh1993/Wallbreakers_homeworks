class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (cache.get(target - nums[i]) != null) {
                return new int[] { cache.get(target - nums[i]), i };
            }
            cache.put(nums[i], i);
        }
        return new int[2];
    }
}
