class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;

        int altitude = 0;
        int max = 0;

        for(int i : gain){
            altitude  += i;
            max = Math.max(max, altitude);
        }

        return max;        
    }
}