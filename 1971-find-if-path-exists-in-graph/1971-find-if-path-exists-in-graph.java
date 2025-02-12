class Solution {
    static boolean isVisited[];
    static ArrayList<Integer> arr[];
    static int end;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        arr = new ArrayList[n];
		isVisited = new boolean[n];
		end = destination;

        boolean result = false;

		for (int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}

		for (int[] edge : edges) {
			int a = edge[0];
			int b = edge[1];

			arr[a].add(b);
			arr[b].add(a);
		}

		return dfs(source);
    }

    public boolean dfs(int s){
        if(s==end){
			return true;
		}

        isVisited[s] = true;
		
		for(int i : arr[s]){    // arr[s] 배열의 각 숫자들을 하나씩 확인
			if(!isVisited[i]){
				if(dfs(i)){     // 경로를 만나면 바로 true 반환
                    return true;
                }
			}
		}
        return false;
    }
}