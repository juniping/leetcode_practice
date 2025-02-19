import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Integer> arr[];
	static boolean isVisited[];
	static int N;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		arr = new ArrayList[N+1]; // 1~N까지의 숫자들의 연결 관계를 표현
		isVisited = new boolean[N+1]; // 1~N까지의 숫자들에 대한 방문 여부를 표기
		sb = new StringBuilder();

		for (int i = 0; i < N+1; i++) {
			arr[i] = new ArrayList<>();
		}

		for(int i=0; i<M; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a].add(b);
			arr[b].add(a);
		}

		// 작은 수부터 방문하기 위해 정렬
		for (int i = 0; i < N + 1; i++) {
			Collections.sort(arr[i]);
		}

		dfs(V);
		System.out.println(sb.toString());

		sb = new StringBuilder();
		isVisited = new boolean[N+1];
		bfs(V);
		System.out.println(sb.toString());


	}

	public static void dfs(int n){
		isVisited[n] = true;
		sb.append(n + " ");

		for(int i : arr[n]){
			if(!isVisited[i]){
				dfs(i);
			}
		}
	}

	// queue를 활용해야한다.
	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		isVisited[start] = true; //queue에 추가되면 방문 처리한다.

		// q가 비어있지 않는 한 계쏙 돈다.
		while (!q.isEmpty()) {
			int n = q.poll();
			sb.append(n + " "); //queue에서 꺼내면 출력한다.

			for (int i : arr[n]) {
				if (!isVisited[i]) {
					q.offer(i);
					isVisited[i] = true;
				}
			}
		}
	}
}
