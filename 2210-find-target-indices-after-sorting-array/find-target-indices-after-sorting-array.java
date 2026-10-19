import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    List<Integer> tar = new ArrayList<>(nums.length);
     Arrays.sort(nums);
     int i =0;
     while(i< nums.length){
         if(target == nums[i]){
             tar.add(i);
         }
         i++;
     }
    return tar;
    }
}