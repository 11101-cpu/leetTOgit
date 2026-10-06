import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {
        int n =0;
        int i =0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        while(i<set.size()){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return i;
    }
}
