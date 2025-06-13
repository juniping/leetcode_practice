import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String str[] = s.split(" ");
        
        int val[] = new int[str.length];
        
        for(int i=0; i<str.length; i++){
            val[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(val);
        
        answer = val[0] + " " + val[str.length-1];
        
        return answer;
    }   
}
