import java.util.*;

class Solution {
    
    static ArrayList<Integer> arr[];
    
    public int solution(int n, int[][] wires) {
        
        arr = new ArrayList[n+1]; // n을 n으로 인식하기 위해 n+1 사이즈로 지정
        
        // 각 리스트값을 초기화
        for(int i=0; i<n+1; i++){
            arr[i] = new ArrayList<>();
        }
        
        // 리스트에 연관관계 설정
        for(int i=0; i<n-1; i++){
                arr[wires[i][0]].add(wires[i][1]);
                arr[wires[i][1]].add(wires[i][0]);
        }
        int result = Integer.MAX_VALUE;
        
        for(int i=1; i<n+1; i++){
            for(int num : arr[i]){
                // i가 갈 수 있는 곳들 중 i 보다 작은 값은 방문하지 않음 (한쪽 방향으로 커팅을 진행)
                if(i<num){
                    int bfsCnt = bfs(i, num, n);
                    result = Math.min(result, Math.abs((n-bfsCnt)-bfsCnt));
                }
            }
        }        
        return result;
    }
    
    
    public int bfs(int start, int end, int n){
        
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[n+1];
        
        int cnt = 1;
        q.offer(start);
        isVisited[start] = true;
        
        while(!q.isEmpty()){
            int v = q.poll();
            for(int i : arr[v]){
                if(!isVisited[i] && i!=end){
                    q.offer(i);
                    isVisited[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
