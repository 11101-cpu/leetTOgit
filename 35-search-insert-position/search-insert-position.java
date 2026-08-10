import java.util.Arrays;

class Solution {
    public int searchInsert(int[] nums, int target) {
    int index =0;
    int i;
        for( i =0; i< nums.length;i++){
            if(nums[i]==target || (nums[i]!=target &&target<nums[i]))
                break;
    }
        index = i;
      return index;
}
}

public class Main {
    public static void main(String[] args) {
       int[] n = new int[]{1,2,5,7};
       int t = 8;
       Solution sol = new Solution();
       int k = sol.searchInsert(n,t);
       System.out.println(k);
    }
}
