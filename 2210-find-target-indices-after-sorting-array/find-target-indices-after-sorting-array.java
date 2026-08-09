class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int low = 0;
        int high = n - 1;

        List<Integer> result = new ArrayList<>();

        while (low <= high) {
            int guess = low + (high - low) / 2;

            if (nums[guess] < target) {
                low = guess + 1;
            } 
            else if (nums[guess] > target) {
                high = guess - 1;
            } 
            else {
                for (int i = 0; i < n; i++) {
                    if (nums[i] == target) {
                        result.add(i);
                    }
                }
                return result;
            }
        }

        return result;
    }
}