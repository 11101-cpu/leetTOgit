class Solution {
    public int sumOfSquares(int[] nums) {
        int sum =0;
        int left =0;
        while(left<nums.length){
            int lol = left+1;
            if(nums.length%lol == 0){
                sum += nums[left]*nums[left];
            }
            left++;
        }
        return sum;
    }
}