class Solution {
    public String removeStars(String s) {

        Stack<Character> letter = new Stack<>();

        for(Character c : s.toCharArray()){
            if(c=='*' && !letter.isEmpty()){
                letter.pop();
            }else{
                letter.push(c);
            }
        }

        String reverse = "";
        String result = "";

        while(!letter.isEmpty()){
            reverse += letter.pop();
        }
        
        for(int i=0; i<reverse.length(); i++){
            result += reverse.charAt(reverse.length()-i-1);
        }

        return result;
    }
}