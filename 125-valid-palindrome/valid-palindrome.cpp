class Solution {
public:
    bool isPalindrome(string s) {
      //  int l = 0,k=0;
        string rev;
        string og;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isalpha(s[i]) || isdigit(s[i])) {
                rev += tolower(s[i]);

            }
        }
        for (int j=0; j<s.length(); j++) {
            if (isalpha(s[j]) || isdigit(s[j])) {
                
               og += tolower(s[j]);
              
            }
        }

        return rev == og;
    }
};