class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int y = x;
        if (x > 0) {
            while (x != 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }
        }
        return y == reversed;

    }
}
class Main {
    public static void main(String[] args) {

        boolean result;
        Solution sol = new Solution();

        result = sol.isPalindrome(10);
        if(result==true){
            System.out.println("Is A Palindrome ");
        }
        else{
            System.out.println("Is Not A Palindrome");
        }

    }
}