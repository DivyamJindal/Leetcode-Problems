
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        
        if (x < 10) {
            return true;
        }
        int rev = 0;
        int or = x;
        
        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x /= 10;
        }
        
        return or == rev;
        
        
            
            
        
    }
}
