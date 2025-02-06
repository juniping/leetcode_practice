import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken()); // 배낭의 최대 수용 가능 무게
        int N = Integer.parseInt(st.nextToken()); // 귀금속의 종류

        int arr[][] = new int[N][2]; //귀금속 정보를 담을 배열

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int result =0 ; // 최종 출력 값
        int wNow = 0; // 현재 가방의 무게

        Arrays.sort(arr, ((o1,o2) -> o2[1]-o1[1]));

        for(int i=0; i<N; i++){
            int weight = arr[i][0];
            int price = arr[i][1];

            if(weight > (W-wNow)){
                result += (W-wNow)*price;
                wNow += (W-wNow);
                arr[i][0] -= W-wNow;
            }else{
                result += (weight*price);
                wNow += weight;
                arr[i][1] -= weight;
            }
        }
        System.out.println(result);
    }
}
