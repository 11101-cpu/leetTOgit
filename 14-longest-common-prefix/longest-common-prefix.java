class Solution {
    public String current;

    public String longestCommonPrefix(String[] strs) {

        String Prefix = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            current = strs[i];
            int j=0;
                while(j<Prefix.length()&&j<current.length()&& Prefix.charAt(j)==current.charAt(j)){
                    j++;
                }
                Prefix = Prefix.substring(0,j);
        }
        if(Prefix.isEmpty()){
            return "";
        }
        return Prefix;
    }
}
public class Main {
    public static void main(String[] args) {
    String[] strs = new String[]{"abc","def","ghi"};
    Solution sol = new Solution();
    String Pf;
    Pf = sol.longestCommonPrefix(strs);
    System.out.println(Pf);
    }
}