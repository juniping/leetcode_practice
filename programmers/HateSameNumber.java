import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]); // 첫번째 숫자는 반드시 추가
        
        for(int i=1; i<arr.length; i++){
            // 지금 숫자와 스택의 최근 숫자 비교해서 같으면 이미 스택에 지금 숫자가 있음
            if(arr[i] != stack.peek()){
                stack.push(arr[i]);
            }
        }
        
        answer = new int[stack.size()];
        
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}
