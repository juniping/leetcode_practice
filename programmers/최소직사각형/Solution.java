class Solution {
    public int solution(int[][] size) {
        
        int len = size.length;
        
        for(int i=0; i<len; i++){
            if(size[i][0] < size[i][1]){
                int temp = size[i][0];
                size[i][0] = size[i][1];
                size[i][1] = temp;
            }
        }
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i=0; i<len; i++){
            maxWidth = Math.max(size[i][0], maxWidth);
            maxHeight = Math.max(size[i][1], maxHeight);
        }
        
        return maxWidth*maxHeight;
    }
}
