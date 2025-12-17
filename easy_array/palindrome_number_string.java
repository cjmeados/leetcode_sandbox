class Solution {
    public boolean isPalindrome(int x) {
        
        String integerString = Integer.toString(x);

        for (int i = 0; i < integerString.length() / 2; i++) {

            char start = integerString.charAt(0);

            char fin = integerString.charAt(integerString.length() -1);

            if (start != fin) {
                return false;
            }
        }

        return true;
    }
}