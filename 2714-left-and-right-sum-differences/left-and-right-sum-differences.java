
class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] rsum = new int[n];
        int[] lsum = new int[n];
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                rsum[i] += nums[j];
            }

            for (int j = 0; j < i; j++) {
                lsum[i] += nums[j];
            }

            ans[i] = Math.abs(lsum[i] - rsum[i]);
        }

        return ans;
    }
}
