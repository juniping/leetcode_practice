class Solution {
    public String longestCommonPrefix(String[] strs) {

        String finalStr = "";
        
        Arrays.sort(strs);
        
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];

        for (int i=0; i<Math.min(firstStr.length(), lastStr.length()); i++){
            if(firstStr.charAt(i) == lastStr.charAt(i)){
                finalStr += firstStr.charAt(i);
            }else{
                break;
            }
        }

        
        return finalStr;
    }
}