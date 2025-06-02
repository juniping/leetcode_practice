class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int len = Math.min(word1.length(), word2.length());



        for(int i=0; i<len; i++){
            result+= word1.substring(i,i+1);
            result+= word2.substring(i,i+1);
        }

        if(len == word1.length()){
            for(int i=len; i<word2.length(); i++){
                result+= word2.substring(i,i+1);
            }
        }else{
            for(int i=len; i<word1.length(); i++){
                result+= word1.substring(i,i+1);
            }
        }

        return result;


    }
}