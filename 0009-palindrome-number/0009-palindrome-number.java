class Solution {
    public boolean isPalindrome(int x) {
        String temp1 = Integer.toString(x);

        StringBuffer sb = new StringBuffer(temp1);
        String temp2 = sb.reverse().toString();

        if(temp1.equals(temp2)){
            return true;
        }

        return false;

    }
}