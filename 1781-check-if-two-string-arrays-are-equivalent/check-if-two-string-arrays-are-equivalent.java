class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1= "";
        String s2 = "";
        for(String string : word1){
            s1 = s1.concat(string);
        }
        for(String string2:word2){
            s2=s2.concat(string2);
        }
        s1=s1.trim();
        s2=s2.trim();
        return s1.equals(s2);
    }
}