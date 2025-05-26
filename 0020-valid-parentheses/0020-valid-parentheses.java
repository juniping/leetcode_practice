class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char c : s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else {
                if (!stack.isEmpty()){
                    char temp = stack.pop();
                    if(temp!=map.get(c)){
                        return false;
                    }
                }else{
                    return false; // stack이 비었는데 닫는 괄호가 나온 경우 
                }
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }

        return true;        
    }
}
