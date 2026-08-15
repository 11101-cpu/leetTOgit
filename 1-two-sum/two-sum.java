class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        // This line is never reached if the problem guarantees one solution.
        return new int[]{};
    }
}

class Main {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        Solution sol = new Solution();

        int[] result = sol.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}