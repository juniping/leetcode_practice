class Solution {
    public String reformat(String s) {
        // 큐 활용
        Queue<Character> digits = new ArrayDeque();
        Queue<Character> chars = new ArrayDeque();

        // 받은 문자열 s에서 숫자는 digits로, 문자는 chars로 넣는다.
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                digits.add(c);
            }else{
                chars.add(c);
            }
        }

        // 문자, 숫자 개수 비교 (하나 더 많으면 빈값 리턴)
        if(Math.abs(digits.size()-chars.size())>1){ 
            return "";
        }

        StringBuilder res = new StringBuilder();
        
        boolean checker = true;
        if(digits.size()>=chars.size()){
            checker = true;
        }else{
            checker = false;
        }

        for (int i=0; i<s.length(); i++){
                if(checker){
                    res.append(digits.poll());
                }else{
                    res.append(chars.poll());
                }
                checker = !checker;
        }

        return res.toString();

    }
}