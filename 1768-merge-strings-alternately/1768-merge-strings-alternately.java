class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int len = Math.max(word1.length(), word2.length());

        for(int i=0; i<len; i++){
            if(i < word1.length()){
                result+= word1.substring(i,i+1);
            }
            if(i < word2.length()){
                result+= word2.substring(i,i+1);
            }            
        }
        return result;
    }
}