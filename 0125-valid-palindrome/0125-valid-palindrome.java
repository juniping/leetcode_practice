class Solution {
    public boolean isPalindrome(String s) {
        String straight = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverse = new StringBuffer(straight).reverse().toString();
        return straight.equals(reverse);
    }
}
