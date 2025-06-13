import java.util.*;

class Solution {
    boolean solution(String s) {

        boolean answer = true;

        if(s.length() == 0){
            answer = false;
        }

        Map<Character, Character> maps = new HashMap<>();

        maps.put('}', '{');
        maps.put(']', '[');
        maps.put(')', '(');

        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if(maps.containsValue(c)){ //여는 괄호인지 ?
                  stack.push(c);
            }else if(maps.containsKey(c)){ // 닫는 괄호니 ?
                if(stack.isEmpty()){
                    answer = false;
                }else{
                    Character opener = stack.pop();
                    if(maps.get(c)  != opener){
                        answer = false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}
