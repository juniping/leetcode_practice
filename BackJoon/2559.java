import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result[] = new int[n-m+1];
		int max = Integer.MIN_VALUE;

		//실행
		for(int j=0; j<n-m+1; j++){
			result[j] = arr[j];
			for(int k=1; k<m; k++){
				result[j] += arr[j+k];

			}

			if(result[j]>max){
				max = result[j];
			}
		}

		System.out.println(max);

	}
}

