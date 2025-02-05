import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        /* 1. 선언부 ******************************************************/
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 행의 갯수
        int m = Integer.parseInt(st.nextToken()); // 열의 갯수
        int attackArray[][] = new int[2][2]; // 공격에 대한 이차원 배열
        int survivedDestroyer = 0; // 생존한 파괴범
        int result = 0;

        /* 2. 입력부 ******************************************************/
        
        // 그래프에서 각 행의 환경 파괴범을 카운트
        int arr[] = new int[100]; // 환경 파괴범 갯수를 나타내는 배열
        
        for (int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int cnt = 0;
            
            for(int j=0; j<m; j++){
                if(Integer.parseInt(st.nextToken()) > 0){
                    cnt++;
                }
            }
            arr[i] = cnt; // 각 행의 환경 파괴범 저장.
        }

        // 1번쨰 공격 입력
        st = new StringTokenizer(br.readLine());
        
        attackArray[0][0] = Integer.parseInt(st.nextToken())-1;
        attackArray[0][1] = Integer.parseInt(st.nextToken())-1;
        
        // 2번째 공격 입력
        st = new StringTokenizer(br.readLine());
        attackArray[1][0] = Integer.parseInt(st.nextToken())-1;
        attackArray[1][1] = Integer.parseInt(st.nextToken())-1;

        /* 3. 실행부 ******************************************************/

        // 파괴범 공격 진행
        for (int i=0; i<2; i++){
            for(int s = attackArray[i][0]; s <= attackArray[i][1]; s++){
                if(arr[s]>0){
                    arr[s]--;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            result += arr[i];
        }

        System.out.println(result);
    }
}
