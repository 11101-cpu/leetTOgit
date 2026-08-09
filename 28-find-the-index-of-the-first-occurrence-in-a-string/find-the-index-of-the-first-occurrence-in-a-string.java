class Solution {
    public int strStr(String haystack, String needle) {

     boolean result = haystack.contains(needle);
     if(!result)
         return -1;

    int index = haystack.indexOf(needle);


return index;
}
}
public class Main {
    public static void main(String[] args) {
       String h = "butsad";
       String n = "sad";
       Solution sol = new Solution();

       int i = sol.strStr(h,n);
       System.out.println(i);
    }
}
