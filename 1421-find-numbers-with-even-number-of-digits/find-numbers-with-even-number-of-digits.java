class Solution {
    public int findNumbers(int[] nums) {
        int i = 0;
        int count = 0;
        while (i < nums.length) {
           // int j = 0;
            String str = String.valueOf(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
            i++;
        }
        /*    while (nums[i] != 0) {

                nums[i] = nums[i] / 10;
                j++;
            }
            if(j%2==0){
                count++;
            }
        }*/
        return count;
    }
}