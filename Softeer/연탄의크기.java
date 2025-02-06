import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfHouse = Integer.parseInt(st.nextToken());
        int arr[] = new int[numOfHouse];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<numOfHouse; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int temp[] = new int[max];
        int newMax = 1;
        for(int i=2; i<=max; i++){
            for(int j=0; j<numOfHouse; j++){
                if(arr[j]%i == 0){
                    temp[i-1]++;
                }
            }
            if(newMax < temp[i-1]){
                newMax = temp[i-1];
            }
        }

        System.out.println(newMax);
    }
}
