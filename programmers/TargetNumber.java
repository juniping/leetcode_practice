class Solution {    
    static int answer;
    static int T;
    public int solution(int[] numbers, int target) {
        answer = 0;
        T = target;
        
        int sum = 0;
        
        dfs(numbers, 0,  sum); // 첫번째 숫자로  dfs 탐색을 보낸다.
        
        return answer;
    }
    
    public static void dfs(int[] numbers, int i, int sum){
        if( i < numbers.length ){
            // -로 가는거
            dfs(numbers, i+1, sum+numbers[i]);

            // +로 가는거
            dfs(numbers, i+1, sum-numbers[i]);
        }else if(sum == T){
                answer++;
        }
        return;
    }
}
