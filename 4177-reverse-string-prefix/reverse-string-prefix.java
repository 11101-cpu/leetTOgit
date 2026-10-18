class Solution {
    public String reversePrefix(String s, int k) {
    char[] ch = s.toCharArray();
    int right = k-1;
    int left =0;
    while(left<right){
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        right--;
        left++;
    }
    String sam = String.valueOf(ch);
    return sam;
    }
}