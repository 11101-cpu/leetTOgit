import java.util.HashSet;
import java.util.Hashtable;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       // HashSet<Character> j = new Hashset<>();
        int count =0;
        int i =0;
        while(i<stones.length()){
            char ch = stones.charAt(i);
            if(jewels.contains(String.valueOf(ch))){
               count++;
            }
            i++;
        }
    return count;
    }
}