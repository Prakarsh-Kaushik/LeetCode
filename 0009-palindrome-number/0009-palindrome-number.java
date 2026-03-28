class Solution {
    public boolean isPalindrome(int x) {
       String xAsString = String.valueOf(x);
       StringBuilder string = new StringBuilder(xAsString);
       String reverseCheck = string.reverse().toString();

       return xAsString.equals(reverseCheck);
        
    }
}