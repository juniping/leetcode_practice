import java.util.*;

class Solution {
    boolean[] isVisited;
    ArrayList<Integer>[] arr;   
    
    public int solution(int n, int[][] computers) {
        int answer = 0; // 네트워크의 개수
        
        arr = new ArrayList[n]; // 정점의 개수 +1 (1부터 고려하기 위해) 
        isVisited = new boolean[n]; // 방문여부를 체크
        
        for(int i=0; i<n; i++){
            arr[i] = new ArrayList<>();
        }
        
        for(int i=0; i<computers.length; i++){
            for(int j=0; j<n; j++){
                if((i!=j) && (computers[i][j])==1){ //computers[i][j] = i정점이 j와 만나는 여부
                    arr[i].add(j);
                    arr[j].add(i);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(!isVisited[i]){
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int n){
        isVisited[n] = true;
        
        for(int i: arr[n]){
            if(!isVisited[i]){
                dfs(i);
            }
        }
    }
}
