import java.util.*;

class Solution {
    public int solution(String S) {

        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stk = new Stack<>();

        for(Character c: S.toCharArray()){
            if(map.containsValue(c)){
                // 여는 괄호인 경우
                stk.push(c);
            }else if(stk.isEmpty() || (map.get(c) != stk.pop())){
                return 0;
            }
        }
        if(stk.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}
