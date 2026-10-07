class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int right = 0;
     int left = 0;
     int max =0;
     while(right< nums.length){
     if(nums[right]==1 && nums[left]==1){
         right++;
         max= Math.max(max, right-left);
     }
     else{
         left=right+1;
         right++;
     }
     }
     return max;
    }
}