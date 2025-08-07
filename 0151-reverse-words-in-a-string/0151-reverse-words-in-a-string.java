class Solution {
    public String reverseWords(String s) {

        int len  = s.length();

        Map<Integer, String> map = new HashMap<>();


        int index = 0;

        String chars = "";

        for(int i=0; i<len; i++){
            // 공백이 아닌 애들
            if(s.charAt(i) != ' '){
                chars += s.charAt(i);
            }

            if(s.charAt(i) == ' ' || i==len-1){
                if(!chars.isEmpty()){
                    map.put(index, chars);
                    index++;
                }
                chars = "";
            }
        }

        String result = "";

        for(int i=map.size()-1; i>=0; i--){
            result += map.get(i);
            if(i>0) result += " ";
        }
        
        return result;

    }
}