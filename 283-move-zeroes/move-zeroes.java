class Solution {
    public void moveZeroes(int[] nums) {
        int right =0;
        int left = 0;

        while (left < nums.length){
            if ((nums[left]!=0)) {
                int temp = nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                right++;
            }
            left++;
            
        }
   
    }
}














