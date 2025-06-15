class Solution {
    public int solution(int[][] size) {
        
        int len = size.length;
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<len; i++){
            maxWidth = Math.max(maxWidth, Math.max(size[i][0], size[i][1]));
            maxHeight = Math.max(maxHeight, Math.min(size[i][0], size[i][1]));
        }
        
        return maxWidth*maxHeight;
    }
}
